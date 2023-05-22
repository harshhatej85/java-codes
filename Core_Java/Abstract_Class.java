package Core_Java;


abstract class Android {
    Android() {
        System.out.println("Android version 12.45");
    }

    void on() {
        System.out.println("Turning on");
    }

    abstract void os();
}

class Samsung extends Android {
    @Override
    void os() {
        System.out.println("This is One ui Operating System");
    }

    void update() {
        System.out.println("Checking for One ui Updates...");
    }
}

abstract class AndroidLite extends Android {
    void showVersion() {
        System.out.println("This is Android Lite 5.0");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
//           Android a = new Android();  --Not allowed
        Samsung a = new Samsung();
//        AndroidLite b = new AndroidLite(); --Not allowed
        a.os();
        a.on();

    }
}
