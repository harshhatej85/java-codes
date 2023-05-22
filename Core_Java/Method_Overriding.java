package Core_Java;

class One {
    public int a;

    public int meth() {
        return 5;
    }

    public void meth2() {
        System.out.println("I am method 2 of class One");
    }
}

class Two extends One {
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class Two");
    }

    public void meth3() {
        System.out.println("I am method 3 of class Two");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        One a = new One();
        System.out.println(a.meth());
        a.meth2();

        Two b = new Two();
        System.out.println(b.meth());
        b.meth2();
    }
}
