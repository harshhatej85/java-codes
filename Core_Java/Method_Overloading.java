package Core_Java;

public class Method_Overloading {

    static void meth() {
        System.out.println("Hello Good Morning !");
    }

    static void meth(int x) {
        System.out.println("Hello " + x + " bro !");
    }

    static void meth(int x, int y) {
        System.out.println("Hello " + x + " bro ! " + y);
    }

    public static void main(String[] args) {

        int a = 999;
        meth();
        meth(a);
        meth(4, 9);
    }
}
