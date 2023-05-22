package Core_Java;

class base1 {
    base1() {
        System.out.println("This is constructor of base class.");
    }

    base1(int x) {
        System.out.println("This is overloaded constructor of base class with value " + x);
    }
}

class derived1 extends base1 {
    derived1() {
        System.out.println("This is constructor of derived class.");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("This is overloaded constructor of derived class with value " + y);
    }
}

class childOfDerived extends derived1 {
    childOfDerived() {
        System.out.println("This is child class constructor.");
    }

    childOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("This is overloaded constructor of child class with value " + z);
    }
}


public class Constructors_in_Inheritance {
    public static void main(String[] args) {

//        base1 b = new base1();
//        derived1 d = new derived1();
//        derived1 d1 = new derived1(10, 8);
//        childOfDerived a = new childOfDerived();
        childOfDerived a1 = new childOfDerived(12, 13, 14);


    }
}
