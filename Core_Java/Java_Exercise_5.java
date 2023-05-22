package Core_Java;

class Shape {
    int dim1, dim2;

    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1() {
        return this.dim1;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public int getDim2() {
        return this.dim2;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}


class Rectangle9 extends Shape {
    Rectangle9(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void area() {
        int area = this.dim1 * this.dim2;
        System.out.println("The Surface area of Rectangle is : " + area + " Unit/s square");
    }
}


class Square9 extends Shape {
    Square9(int dim1) {
        super(dim1, -1);
    }

    public void area() {
        int area = this.dim1 * this.dim1;
        System.out.println("The area of Square is : " + area + " Unit/s square");
    }
}


class Circle9 extends Shape {
    Circle9(int dim1) {
        super(dim1, -1);
    }

    public void area() {
        int area = (int) Math.PI * dim1 * dim1;
        System.out.println("The area of circle is : " + area + " Unit/s square");
    }
}


class Cylinder9 extends Shape {
    Cylinder9(int dim1, int dim2) {
        super(dim1, dim2);
    }

    void volume() {
        int volume = (int) Math.PI * dim1 * dim1 * dim2;
        System.out.println("The volume of cylinder is : " + volume + " Unit/s cube");

    }
}


class Sphere9 extends Shape {
    Sphere9(int dim1) {
        super(dim1, -1);
    }

    void areasp() {
        int area = (int) (4 * Math.PI * this.dim1 * this.dim1);
        System.out.println("The Surface area of Sphere is : " + area + " Unit/s square");
    }

    void volume() {
        int volume = (int) ((4 / 3) * Math.PI * this.dim1 * this.dim1 * this.dim1);
        System.out.println("The Volume of Sphere is : " + volume + " Unit/s cube");
    }
}


public class Java_Exercise_5 {
    public static void main(String[] args) {
        Rectangle9 r = new Rectangle9(6, 8);
        Square9 s = new Square9(5);
        Circle9 c = new Circle9(9);
        Cylinder9 cy = new Cylinder9(4, 8);
        Sphere9 sp = new Sphere9(2);

        r.area();
        s.area();
        c.area();
        cy.volume();
        sp.areasp();
        sp.volume();

    }
}
