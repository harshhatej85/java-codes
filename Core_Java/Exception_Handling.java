package Core_Java;

public class Exception_Handling {
    public static void main(String[] args) {
        int a = 7000;
        int b = 0;

//       Without Try     -> the code will simply terminate if we don't use try catch method and won't go further
//        int c = a / b;
//        System.out.println("The result is : " + c);

//        With Try       -> the code will keep executing even if any exception occurs
        try {
            int c = a / b;
            System.out.println("The result is : " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide reason : " + e);
        }
        System.out.println("Program ended successfully");


    }
}
