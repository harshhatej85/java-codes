package Core_Java;

public class Practise_Set_7 {

    //      Problem 1
//        Write a Java method to print the multiplication table of a number n.
    static void Multiplication(int n) {
        for (int x = 1; x <= 10; x++) {
            int i = 1;
            i = x * n;
            System.out.println(n + " x " + x + " = " + i);
        }
    }


    //       Problem 2
//        2. Write a program using functions to print the following pattern:

    //           *
//           **
//           ***
//           ****
    static void Stars_1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //       Problem 3
//        3. Write a recursive function to calculate the sum of first n natural numbers.
    static int addition(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addition(n - 1);
    }


    //       Problem 4
//        4. Write a function to print the following pattern:

    //          ****
//          ***
//          **
//          *
    static void Stars_2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //       Problem 5
//        5. Write a function to print the nth term of the Fibonacci series using recursion.
    //    Code to print fibonacci series :
    static int fibonacci_series(int n) {
        if (n == 1 || n == 2) {
            return (n - 1);
        }
        return fibonacci_series(n - 1) + fibonacci_series(n - 2);
    }


    //       Problem 6
//        6. Write a function to find the average of a set of numbers passed as arguments.
    static float average(float... arr) {
        float result = 0.0f;
        for (float a : arr) {
            result = +result + a;
        }
        return result / arr.length;
    }


    //       Problem 7
//        7. Repeat problem 4 using Recursion.
    static void Stars_1_Rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            Stars_2(n - 1);
        }
    }


    //       Problem 8
//        8. Repeat problem 2 using Recursion.
    static void Stars_2_Rec(int n) {
        if (n > 0) {
            Stars_1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //       Problem 9
//        9. Write a function to convert Celsius temperature into Fahrenheit.
//           HINT -  (0°C × 9/5) + 32 = 32°F
    static float Temp_Converter(float n) {
        float f = 0;
        System.out.print("The fahrenheit conversion of " + n + " degree celsius is : ");
        f = (n * 9 / 5) + 32;
        return f;
    }

    //       Problem 10
//        10. Repeat problem 3 using an iterative approach.
    static int sum(int n) {
        int x = 0;
        System.out.println("The sum of the first " + n + " natural numbers are : ");
        for (int i = 0; i < n; i++) {
            x += n - i;
        }
        return x;
    }


    public static void main(String[] args) {

//        P1
//        int n = 9;
//        System.out.println("The multiplication table of " + n + " is : ");
//        Multiplication(n);


//        P2
//        Stars_1(4);


//        P3
//        System.out.println("The addition of first 10 natural numbers is " + addition(10));


//        P4
//        Stars_2(4);


//        P5
//        System.out.println(fibonacci_series(1));


//        P6
//        System.out.println(average(2, 6, 8));


//        P7
//        Stars_1_Rec(5);


//        P8
//        Stars_2_Rec(10);


//        P9
//        System.out.print(Temp_Converter(34.87879f) + "° Fahrenheit");


//        P10
//        System.out.println(sum(100));

    }
}
