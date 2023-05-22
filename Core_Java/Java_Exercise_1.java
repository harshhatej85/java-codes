package Core_Java;

import java.util.Scanner;

public class Java_Exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        byte physics = sc.nextByte();
        System.out.println("Enter your Hindi marks : ");
        byte hindi = sc.nextByte();
        System.out.println("Enter your Maths marks : ");
        byte maths = sc.nextByte();
        System.out.println("Enter your Chemistry marks : ");
        byte chemistry = sc.nextByte();
        System.out.println("Enter your English marks : ");
        byte english = sc.nextByte();

        float percentage = (physics + hindi + english + chemistry + maths) / 500f * 100;

        if (percentage > 100) {
            System.out.println("You have Entered wrong marks, Please retry with correct marks.");
        }
        if (percentage > 30 && percentage < 100) {
            System.out.println("You have obtained " + percentage + "% and you are promoted !");
        }
        if (percentage < 30 && percentage > 0) {
            System.out.println("You have obtained " + percentage + "%  and you are failed '_'");
        }
    }
}
