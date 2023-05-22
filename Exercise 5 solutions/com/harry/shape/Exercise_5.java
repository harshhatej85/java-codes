package com.harry.shape;

class Rectangle {
    int length;
    int breadth;

    public int getlength() {
        return length;
    }

    public void setlength(int x) {
        length = x;
    }

    public int getbreadth() {
        return breadth;
    }

    public void setbreadth(int y) {
        breadth = y;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("The Surface area of Rectangle is : " + area);
    }


}

class Square {
    int side;

    public int getside() {
        return side;
    }

    public void setside(int s) {
        side = s;
    }

    public void area() {
        double area = side * side;
        System.out.println("The area of Square is : " + area);
    }


}

class Circle {
    int radius;

    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }

    public void areac() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle is : " + area);
    }


}

class Cylinder extends Circle {
    int height;
    int radius;

    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int h) {
        height = h;
    }

    public void volume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of cylinder is : " + volume);

    }


}


class Sphere extends Circle {
    int radius;

    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }

    void area() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("The Surface area of Sphere is : " + area);
    }

    void volume() {
        double volume = (4 / 3) * Math.PI * radius * radius * radius;
        System.out.println("The Volume of Sphere is : " + volume);
    }

}

public class Exercise_5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        Cylinder cy = new Cylinder();
        Sphere sp = new Sphere();

        r.setbreadth(4);
        r.setlength(16);
        r.area();

        s.setside(8);
        s.area();

        c.setradius(5);
        c.areac();

        cy.setheight(9);
        cy.setradius(5);
        cy.volume();


        sp.setradius(7);
        sp.area();
        sp.volume();

    }
}