package Core_Java;

import java.util.Scanner;

class Myexception extends Exception {
    @Override
    public String toString() {
        return "i am toString";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }

}

class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

public class Exception_Class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        if (a < 9) {
            try {
//                throw new Myexception();
                throw new ArithmeticException("This is an Exception ");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finishing");
            }
            System.out.println("Finished");
        }

    }
}
