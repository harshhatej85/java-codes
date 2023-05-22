package Core_Java;

class GM extends Thread {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Good Morning");
        }
    }
}

class WC extends Thread {
//    Use this method for question 1 :
//    public void run() {
//        int i = 0;
//        while (i < 1000) {
//            System.out.println("Welcome");
//        }
//    }

    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}


public class Practise_Set_13 {
    public static void main(String[] args) {

//        Problem 1
//        Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
        GM a = new GM();
        WC b = new WC();

//        a.start();
//        b.start();

//        Problem 2
//        Add a step method in the welcome thread of question 1 to delay its execution for 200ms.


//        Problem 3
//        Demonstrate gerPriority () and setPriority () methods in Java threads.
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a.getPriority());
        System.out.println(b.getPriority());

//        Problem 4
//        How do you get the state of a given thread in Java?
//        ANSWER --> getState() method is used to get the state of a given thread in Java.

//        Problem 5
//        How do you get the reference to the current thread in Java?
//        currentThread() method is used to reference the current thread in Java.

    }
}
