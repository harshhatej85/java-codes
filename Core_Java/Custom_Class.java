package Core_Java;

class Student {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println();
        System.out.println("My id is : CS" + id);
        System.out.println("My name is : " + name);
    }

    public void getSalary() {
        System.out.println();
        System.out.println(name + "'s salary is : " + salary);
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Student harsh = new Student();// Instantiating a new Student Object
        Student john = new Student();

//        Setting Attributes for harsh
        harsh.id = 211066;
        harsh.name = "Harsh Hatej";
        harsh.salary = 14000000;

//        Setting Attributes for John
        john.id = 212048;
        john.name = "John Boscow";
        harsh.salary = 2100000;

//        Printing the Attributes
//        System.out.println(harsh.id);
//        System.out.println(harsh.name);

//        Printing the Attributes using calling methods by objects
        harsh.printDetails();
        john.printDetails();
        harsh.getSalary();
        john.getSalary();
    }
}
