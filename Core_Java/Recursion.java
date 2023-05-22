package Core_Java;

public class Recursion {

//    static int factorial_recursive(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            n *= factorial_recursive(n - 1);
//        }
//        return n;
//    }
//
//    static int factorial_iterative(int n) {
//        int z = 1;
//        for (int i = 1; i <= n; i++) {
//            z *= i;
//        }
//        return z;
//    }

    static int fibonacci_series(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci_series(n - 2) + fibonacci_series(n - 1);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
//        System.out.println("The value of factorial x is : " + factorial_recursive(x));
//        System.out.println("The value of factorial x is : " + factorial_iterative(y));

        int numbers = 10;
        System.out.println("Fibonacci series upto : " + numbers + " numbers is");
        for (int i = 0; i < numbers; i++) {
            System.out.println(fibonacci_series(i) + " ");
        }
    }
}
