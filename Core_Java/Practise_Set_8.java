package Core_Java;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}


class CellPhone {
    public void ringing() {
        System.out.println("The CellPhone is ringing");
    }

    public void vibrating() {
        System.out.println("The CellPhone is vibrating");
    }
}


class Square {
    int side;

    public void perimeter() {
        int perimeter = 4 * side;
        System.out.println("The Perimeter of the square is " + perimeter + " unit");
    }

    public void area() {
        int area = side * side;
        System.out.println("The area of the square is " + area + " Square unit");
    }
}


class Rectangle {
    int length;
    int breadth;

    public void perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("The Perimeter of the square is " + perimeter + " unit");
    }

    public void area() {
        int area = length * breadth;
        System.out.println("The area of the square is " + area + " Square unit");
    }
}


class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting");
    }

    public void firing() {
        System.out.println("Firing");
    }

    public void running() {
        System.out.println("Running");
    }

    public void driving() {
        System.out.println("Driving");
    }

}


class Circle {
    int radius;

    public void circumference() {
        int perimeter = (2 * (22 / 7) * radius);
        System.out.println("The circumference of the Circle is " + perimeter + " units.");
    }

    public void area() {
        int area = (22 / 7) * radius * radius;
        System.out.println("The area of the Circle is " + area + " Square units.");
    }
}

public class Practise_Set_8 {
    public static void main(String[] args) {


//        Problem 1
//        Create a class Employee with the following properties and methods:
//        - Salary (property) (int)
//                - getSalary (method returning int)
//        - name (property) (String)
//                - getName (method returning String)
//                - setName (method changing name)
        Employee harsh = new Employee();
        harsh.setName("HELLSTROM");   // Sets given input to name
        harsh.salary = 34000;

        System.out.println(harsh.getSalary());
        System.out.println(harsh.getName());   // returns name string


//        Problem 2
//        Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        CellPhone features = new CellPhone();

//        features.ringing();
//        features.vibrating();


//        Problem 3
//        Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        Square obj = new Square();
        obj.side = 8;
//        obj.perimeter();
//        obj.area();


//        Problem 4
//        Create a class Rectangle & problem 3.
        Rectangle cal = new Rectangle();
        cal.length = 4;
        cal.breadth = 5;

//        cal.perimeter();
//        cal.area();


//        Problem 5
//        Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        TommyVecetti game = new TommyVecetti();
//        game.hitting();
//        game.firing();
//        game.running();
//        game.driving();

//        Problem 6
//        Repeat problem 4 for a circle.
        Circle cir = new Circle();

        cir.radius = 5;
//        cir.circumference();
//        cir.area();


    }
}
