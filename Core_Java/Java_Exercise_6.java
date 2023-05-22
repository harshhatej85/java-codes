package Core_Java;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Invalid Input Exception occurred " + getMessage();
    }

    @Override
    public String getMessage() {
        return "Cannot add 8 and 9 !";
    }

}

class CannotDivideByZero extends Exception {
    @Override
    public String toString() {
        return "Divide by zero Exception occurred " + getMessage();
    }

    @Override
    public String getMessage() {
        return "Cannot divide by zero !";
    }

}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Mac Input Exception occurred " + getMessage();
    }

    @Override
    public String getMessage() {
        return "Input can not be greater than 100000";
    }

}

class MaxMultiplierReachedException extends Exception {
    @Override
    public String toString() {
        return "Mac Multiplier Exception occurred " + getMessage();
    }

    @Override
    public String getMessage() {
        return "Can not Multiply by number greater than 7000";
    }

}


class Calculator {
    public static double Addition(double a, double b) throws MaxInputException, InvalidInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a == 8 || b == 9 || a == 9 || b == 8) {
            throw new InvalidInputException();
        }
        System.out.println("The value of " + a + " + " + b + " is : ");
        return a + b;
    }

    public static double Subtraction(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        System.out.println("The value of " + a + " - " + b + " is : ");
        return a - b;
    }

    public static double Division(double a, double b) throws MaxInputException, CannotDivideByZero {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 0 || b == 0) {
            throw new CannotDivideByZero();
        }
        System.out.println("The value of " + a + " / " + b + " is : ");
        return a / b;
    }

    public static double Multiplication(double a, double b) throws MaxInputException, MaxMultiplierReachedException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a >= 7000 || b >= 7000) {
            throw new MaxMultiplierReachedException();
        }
        System.out.println("The value of " + a + " * " + b + " is : ");
        return a * b;
    }
}

public class Java_Exercise_6 {

    public static void main(String[] args) throws MaxInputException, InvalidInputException, MaxMultiplierReachedException, CannotDivideByZero {

        Calculator obj = new Calculator();

        obj.Addition(8, 9);
        obj.Subtraction(1000000, 3);
        obj.Division(1000, 0);
        obj.Multiplication(7005, 3);


//        This didn't worked -->
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the First number : ");
//        int first = sc.nextInt();
//
//        System.out.println("Enter the Second number : ");
//        int second = sc.nextInt();

//        System.out.println("Select an operation : ");
//        System.out.println("Addition =        1");
//        System.out.println("Subtraction =     2");
//        System.out.println("Division =        3");
//        System.out.println("Multiplication =  4");
//        byte choice = sc.nextByte();

//            if (choice == 1) {
//                System.out.println(obj.Addition(first, second));
//            } else if (choice == 2) {
//                System.out.println(obj.Subtraction(first, second));
//            } else if (choice == 3) {
//                System.out.println(obj.Division(first, second));
//            } else if (choice == 4) {
//                System.out.println(obj.Multiplication(first, second));
//            }


    }
}
