package Core_Java;

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Playing valorant");
            System.out.println("Turbo mode");
            i++;
        }

    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Developing using java");
            System.out.println("Windows mode");
            i++;
        }
    }
}

public class MultiThreading_Using_Extends {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();

    }
}
