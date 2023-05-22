package Core_Java;

class Cylinder {
    public static double height;
    public static double radius;
    public double sa;
    public double vol;

    public double surfaceArea() {
        sa = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return sa;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double x) {
        radius = x;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double y) {
        height = y;
    }

    public double volume() {
        vol = (Math.PI * radius * radius * height);
        return vol;

    }
}


class Cylinderr {
    private double radius;
    private double height;

    public Cylinderr(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surface_area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double volume() {
        return (Math.PI * radius * radius * height);
    }
}


class Rect {
    private double length;
    private double breadth;

    public Rect() {
        this.length = 4;
        this.breadth = 5;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double x) {
        this.length = x;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double h) {
        this.breadth = h;
    }
}


class Sphere {
    private double radi;

    public double getRadi() {
        return radi;
    }

    public void setRadi(double x) {
        this.radi = x;
    }
}


public class Practise_Set_9 {
    public static void main(String[] args) {

//        Exercise on Access Modifiers and Constructors


//        Problem 1
//        1. create a class cylinder and use getter and setters to set its radius and height
        Cylinder obj = new Cylinder();
        obj.setRadius(10.43);
        obj.setHeight(8.234);

        //System.out.println("Radius of the Cylinder is : " + obj.getRadius());
        //System.out.println("Height of the Cylinder is : " + obj.getHeight());


//        Problem 2
//        2. use ➊ to calculate surface and volume of the cylinder
        Cylinder obj2 = new Cylinder();

        //System.out.println("The Surface Area of the cylinder is : " + obj2.surfaceArea());
        //System.out.println("The Volume of the cylinder is : " + obj2.volume());


//        Problem 3
//        3. Use a constructor and repeat ➊
        Cylinderr myCylinder = new Cylinderr(7, 5);
//        System.out.println("The Surface Area of the cylinder is : " + myCylinder.surface_area());
//        System.out.println("The Volume of the cylinder is : " + myCylinder.volume());


//        Problem 4
//        4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
        Rect r = new Rect();
        r.setLength(3);
        r.setBreadth(8);

//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());


//        Problem 5
//        5. Repeat ➊ for a sphere
        Sphere sp = new Sphere();
//        sp.setRadi(142.3423);
//        System.out.println("The radius of Sphere is :" + sp.getRadi());

    }
}
