package Core_Java;

class Circle1 {
    public int radius;

    Circle1(int r) {
        this.radius = r;
    }

    public double areaCircle() {
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle1 {
    int height;

    Cylinder1(int r, int h) {
        super(r);
        this.height = h;
    }

    public double areaCylinder1() {
        return 2 * Math.PI * radius * height + 2 * areaCircle();
    }

    public double volumeCylinder1() {
        return areaCircle() * height;
    }
}

class Rectangle1 {
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle1 {
    int height;


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume() {
        return getLength() * getBreadth() * getHeight();
    }

    public int area() {
        return (2 * getLength() * getBreadth()) + (2 * getBreadth() * getHeight()) + (2 * getLength() * getHeight());
    }
}

public class Practise_Set_10 {
    public static void main(String[] args) {

//        Problem 1
//        Create a class circle and use inheritance to create another class cylinder from it
        Cylinder1 a = new Cylinder1(4, 5);


//        Problem 2
//        Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to
//        the real -world scenario as possible
        Cuboid b = new Cuboid();


//        Problem 3
//        Create a method for area and volume in 1
//        System.out.println(a.areaCircle());
//        System.out.println(a.areaCylinder1());
//        System.out.println(a.volumeCylinder1());


//        Problem 4
//        create methods for area & volume in 2 also create getters and setters
        b.setBreadth(8);
        b.setLength(3);
        b.setHeight(4);

//        System.out.println(b.area());
//        System.out.println(b.volume());


//        Problem 5
//        What is the order of constructor execution for the following inheritance hierarchy
//        Base
//        Derived 1
//        Derived 2
//        Derived obj = new Derived 2 ();
//        Which constructor (s) will be executed &in what order ?

//        ANS - the constructors will be called in simple base- dev1 - dev2 order ...
    }
}

