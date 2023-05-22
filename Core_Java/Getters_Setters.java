package Core_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int n) {
        id = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class MyCircle {
    private long radius;

    public long getradius() {
        return radius;
    }

    public void setradius(long n) {
        radius = n;
    }
}


public class Getters_Setters {
    public static void main(String[] args) {
//        MyEmployee harsh = new MyEmployee();
//
//        harsh.setName("Harsh Hatej");
//        harsh.setId(211066);
//
//        System.out.println(harsh.getId());
//        System.out.println(harsh.getName());

        MyCircle obj = new MyCircle();
        Scanner sc = new Scanner(System.in);
        int radius = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter the radius of the circle :");
            try {
                radius = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // discard the input that caused the exception
            }
        }
        if (radius > 0 && radius < Short.MAX_VALUE) {
            obj.setradius(radius);
            System.out.println("The area of the circle is  " + Math.PI * obj.getradius() * obj.getradius() + " unit squares.");
        } else {
            System.out.println("You have entered an invalid input! please try again.");
        }

    }
}
