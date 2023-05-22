package Core_Java;

public class Finally_Keyword {
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Exception occurred ");
        } finally {
            System.out.println("Cleaning up resources... Program ended successfully");
        }
        return -1;
    }

    public static void main(String[] args) {

        int k = greet();
        System.out.println(k);
//        Write a code to execute finally even if the loop breaks
        int a = 64;
        int b = 8;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("The final value of b is - " + b);
            }
            b--;
        }

//        We can also use Finally with try instead of catch block ->

        try {
            System.out.println(10 / 2);
        } finally {
            System.out.println("This is finally");
        }

    }
}