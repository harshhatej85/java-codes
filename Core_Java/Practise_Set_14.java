package Core_Java;

import java.util.Scanner;

class MaxRetriesException extends Exception {
    @Override
    public String toString() {
        return "\nMaxRetriesExceededException: " + getMessage();
    }

    @Override
    public String getMessage() {
        return "You have exceeded the maximum limit of 5 attempts to access the array.";
    }
}

public class Practise_Set_14 {

    static void accessArray() throws MaxRetriesException {
        // declaration
        int indexx = 0, c = 1;
        String[] vegetables = {"Potato", "Garlic", "Ginger", "Tomato", "Onion"};
        boolean isIndexValid;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an index number - ");
            indexx = sc.nextInt();
            try {
                System.out.print("Element at index " + indexx + " - " + vegetables[indexx]);
                isIndexValid = true;
                sc.close();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index.\n\tTry again");
                isIndexValid = false;
            }
            if (isIndexValid == true)
                break;
            else if (c == 5) {
                sc.close();
                throw new MaxRetriesException();
            }
            c++;

        } while (c <= 5);
    }

    public static void main(String[] args) {

//        Problem 1
//        Write a java program to demonstrate syntax, logical 2 runtime errors.
//          int a = 5     // Syntax error
        int age = 58;
        int year_born = 2000 - age;  // Logical error
//        System.out.println(6/0);     // Runtime error / Exception

//        Problem 2
//        Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }

//        Problem 3
//        Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "Error".
        int[] arr = new int[3];
        arr[0] = 8;
        arr[1] = 12;
        arr[2] = 45;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        boolean flag = true;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of the index : ");
                index = sc.nextInt();
                System.out.println("The value of array[index] is : " + arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index !");
                i++;
            }
        }
        if (i > 5) {
            System.out.println("Error");
        }

//        Problem 4
//        Modify program in Q3 to throw a custom Exception if max retries are reached.


//        Problem 5
//        Wrap the program in Q3 inside a method which throws your custom Exception.
        try {
            accessArray();
        } catch (MaxRetriesException m) {
            m.printStackTrace();
        }


    }
}
