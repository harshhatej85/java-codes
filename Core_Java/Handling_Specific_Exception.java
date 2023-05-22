package Core_Java;

import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 57;
        marks[2] = 44;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide with : ");
        int num = sc.nextInt();

        try {
            System.out.println("The value at array index is : " + marks[index]);
            System.out.println("The value of array-index/number is : " + marks[index] / num);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred! Please try again.");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index value " + index + " does not exist in the array.");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("An unknown exception occurred please try again.");
            System.out.println(e);
        }
    }
}
