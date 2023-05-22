package Core_Java;

class Myth1 extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Method from class 1");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Myth2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Method from class 2");
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        Myth1 a = new Myth1();
        Myth2 b = new Myth2();

        a.start();

//        try {
//            a.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        b.start();
    }
}
