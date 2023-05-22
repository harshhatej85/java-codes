package Core_Java;

class First {
    int a;

    First(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int returnone() {
        return 1;
    }
}

class Second extends First {
    Second(int c) {
        super(c);
        System.out.println("I am a Constructor.");
    }
}

public class This_And_Super {
    public static void main(String[] args) {
        First a = new First(5);
        Second b = new Second(10);
        System.out.println(a.getA());
    }
}
