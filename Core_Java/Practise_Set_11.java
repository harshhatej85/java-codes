package Core_Java;

interface TVremote {
    void on();

    void off();
}

interface SmartTVremote extends TVremote {
    void netflix();
}

interface Animals {
    void eating();

    void sleeps();
}

abstract class Pen {
    void write() {
        System.out.println("Writing");
    }

    void refill() {
        System.out.println("Refilling");
    }
}

class FountainPen extends Pen {

    void changenib() {
        System.out.println("Changing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Biting");
    }
}

class Human extends Monkey implements Animals {
    public void eating() {
        System.out.println("Eating Vegetables");
    }

    public void sleeps() {
        System.out.println("Sleeping Zzz");
    }
}

abstract class Telephone {
    abstract void lift();

    abstract void disconnected();

}

class SmartTelephone extends Telephone {
    void lift() {
        System.out.println("Lifting");
    }

    void disconnected() {
        System.out.println("Disconnected");
    }

    void ScreenShot() {
        System.out.println("Taking Screenshot");
    }
}

class TV implements TVremote {
    public void on() {
        System.out.println("Turning on the Television");
    }

    public void off() {
        System.out.println("Turning off the Television");
    }
}

public class Practise_Set_11 {
    public static void main(String[] args) {

//        Problem 1
//        Create an abstract class pen with methods write () and refill () as abstract methods


//        Problem 2
//        Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()


//        Problem 3
//        Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey
//        class and implements basic animal interface with eat ( ) and sleep methods


//        Problem 4
//        Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another
//        class smart telephone and demonstrate polymorphism
        Telephone tel = new SmartTelephone();
        tel.lift();
        tel.disconnected();
//      tel.ScreenShot(); // not allowed


//        Problem 5
//        Demonstrate polymorphism using monkey class from Q3
        Monkey mon = new Human();
        mon.bite();
        mon.jump();
//        mon.eating();   // not allowed


//        Problem 6
//        Create an interface TV remote and use it to inherit another interface smart TV remote


//        Problem 7
//        Create a class TV which implements TV remote interface from Q6
        TV sony = new TV();
        sony.on();
        sony.off();
    }
}
