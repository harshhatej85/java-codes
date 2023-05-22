package Core_Java;

class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 4;
        System.out.println("Hello");
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
        Mythr a = new Mythr("Harsh");
        Mythr b = new Mythr("ash");

        a.start();

        System.out.println("The id of the thread is : " + a.getId());
        System.out.println("The name of the thread is : " + a.getName());

        System.out.println("The id of the thread is : " + b.getId());
        System.out.println("The name of the thread is : " + b.getName());

    }
}
