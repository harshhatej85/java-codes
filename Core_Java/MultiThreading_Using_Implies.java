package Core_Java;

class Runnablethread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Hello how are you");
            i++;
        }
    }
}

class Runnablethread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Fine , thank you");
            i++;
        }
    }
}

public class MultiThreading_Using_Implies {
    public static void main(String[] args) {
        // here we use analogy of gun and bullet to better understand the working of runnable class

        Runnablethread1 bullet1 = new Runnablethread1(); // Making object of desired class
        Thread gun1 = new Thread(bullet1);  //Creating object of Thread class and passing previous object

        Runnablethread2 bullet2 = new Runnablethread2();// Making object of desired class
        Thread gun2 = new Thread(bullet2);  //Creating object of Thread class and passing previous object

        gun1.start();
        gun2.start();

    }
}
