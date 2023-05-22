package Core_Java;

class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("Thank you " + getName());
        }

    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Harsh1");
        Mythr1 t2 = new Mythr1("Harsh2");
        Mythr1 t3 = new Mythr1("Harsh3");
        Mythr1 t4 = new Mythr1("Harsh4");
        Mythr1 t5 = new Mythr1("Harsh5");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
