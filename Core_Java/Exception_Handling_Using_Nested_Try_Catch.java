package Core_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Using_Nested_Try_Catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 57;
        marks[2] = 44;

        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Enter the array index : ");
            int index = sc.nextInt();
            try {
                System.out.println("Programme is running...");
                try {
                    System.out.println("The value at given index is : " + marks[index]);
                    System.out.println("Programme ran Successfully");
                    b = true;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("The given value of index " + index + " does not exists in the array, Please try again");
                } catch (InputMismatchException e) {
                    System.out.println("You have entered invalid input try again");
                }
            } catch (Exception e) {
                System.out.println("An unknown Exception occurred, Please try again");
            }
        }
    }
}
