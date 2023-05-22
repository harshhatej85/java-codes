package Core_Java;

public class Practise_set_4 {
    public static void main(String[] args) {

//        Problem 1
//        What will be the output of this program

//        int a = 10;
//        if (a = 11)
//            System.out.println(“I am 11”);
//        else
//            System.out.println(“I am not 11”);
        // Output = I am not 11


//        Problem 2
//        Write a program to find out whether a student is pass or fail;
//        if it requires a total of 40% and at least 33% in each subject to pass.
//        Assume 3 subjects and take marks as input from the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Physics marks out of 100 : ");
//        byte physics = sc.nextByte();
//        System.out.println("Enter your Maths marks out of 100 : ");
//        byte maths = sc.nextByte();
//        System.out.println("Enter your Chemistry marks out of 100 : ");
//        byte chemistry = sc.nextByte();
//
//        float Percentage = (physics + chemistry + maths) / 300f * 100;
//
//        if (physics < 33) {
//            System.out.println("You have obtained " + Percentage + "% and you have failed in Physics");
//        } else if (maths < 33) {
//            System.out.println("You have obtained " + Percentage + "% and you have failed in Maths");
//        } else if (chemistry < 33) {
//            System.out.println("You have obtained " + Percentage + "% and you have failed in Chemistry");
//        } else if (Percentage > 100) {
//            System.out.println("You have Entered wrong marks please try again with correct marks!");
//        } else if (Percentage < 40) {
//            System.out.println("You have failed and your Percentage score was :" + Percentage + "%");
//        } else {
//            System.out.println("Congratulations you have passed with " + Percentage + "%");
//        }


//        Problem 3
//        Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//        Income Slab     Tax
//        2.5 - 5.0 L     5 %
//        5.0 - 10.0 L    20 %
//        Above 10.0 L    30 %

//        System.out.println("----Income Tax Calculator----");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in per Year in Rupees :");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income <= 250000f) {
//            tax = tax + 0;
//            System.out.println("You do not come under tax slab.");
//        } else if (income > 250000f && income <= 500000f) {
//            tax = tax + 0.05f * (income - 250000);
//            System.out.println("The total tax paid by the employee is: " + tax + " Rupees.");
//        } else if (income > 500000f && income <= 1000000f) {
//            tax = tax + 0.05f * (500000f - 250000f);
//            tax = tax + 0.2f * (income - 5f);
//            System.out.println("The total tax paid by the employee is: " + tax + " Rupees.");
//        } else if (income > 1000000f) {
//            tax = tax + 0.05f * (500000f - 250000f);
//            tax = tax + 0.2f * (1000000f - 500000f);
//            tax = tax + 0.3f * (income - 1000000f);
//            System.out.println("The total tax paid by the employee is: " + tax + " Rupees.");
//        }


//        Problem 4
//        Write a Java program to find out the day of the week given the number
//        [1 for Monday, 2 for Tuesday … and so on!]

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for the day in week : \n (Example - 1 = Monday and so on)");
//        char num = sc.next().charAt(0);
//        switch (num) {                                          //Using Enhanced Switch
//            case '1' -> System.out.println("It's Monday.");
//            case '2' -> System.out.println("It's Tuesday.");
//            case '3' -> System.out.println("It's Wednesday.");
//            case '4' -> System.out.println("It's Thursday.");
//            case '5' -> System.out.println("It's Friday.");
//            case '6' -> System.out.println("It's Saturday.");
//            case '7' -> System.out.println("It's Sunday.");
//        }


//        Problem 5
//        Write a Java program to find whether a year entered by the user is a leap year or not.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Year you want to check is Leap Year or not :");
//        short year = sc.nextShort();
//        if (year % 4 == 0 && 100 % year != 0) {
//            System.out.println("The year " + year + " is a leap year.");
//        } else if (year % 400 == 0) {
//            System.out.println("The year " + year + " is a leap year.");
//        } else {
//            System.out.println("The year " + year + " is not a leap year.");
//        }


//        Problem 6
//        Write a program to find out the type of website from the URL:
//-       .com – commercial website
//-       .org – organization website
//-       .in – Indian website

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the website name :");
//        String site = sc.nextLine();
//
//        if (site.endsWith("org")) {
//            System.out.println(site + " is a Organizational website.");
//        } else if (site.endsWith("com")) {
//            System.out.println(site + " is a Commercial website.");
//        } else if (site.endsWith("in")) {
//            System.out.println(site + " is a Indian website.");
//        }

    }
}
