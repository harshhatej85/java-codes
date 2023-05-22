package Core_Java;

import java.util.Scanner;

// TAKING USER INPUT IN JAVA
// ADDITION OF TWO USER INPUTS IN JAVA
// CHECKING THE USER INPUT IS OF SPECIFIC DATA TYPE
// STORING DATA IN STRING
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number 1 :");
//        int a = sc.nextInt();
//
//        System.out.println("Enter a number 2 :");
//        int b = sc.nextInt();
//
//        int sum = a + b;
//        System.out.println("The sum of the given numbers is : " + sum);
//
//        boolean b1 = sc.hasNextInt();  //hasNext is used to check the user input is of specific data type for validation
//        System.out.println(b1);

        System.out.println("Enter a sentence : ");
//        String str = sc.next();    //used to store a single word in string
        String str = sc.nextLine();  //used to store a sentence in string
        System.out.println(str);


    }
}
