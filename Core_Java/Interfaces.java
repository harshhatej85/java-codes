package Core_Java;

//You can implement more than one interfaces to as single class and also use abstract class or inheritance along with it , you cannot do this by using abstract class
//All the methods created inside the interface are abstract by default and the variables are final
//The fields set in interface is constant and the properties can be overridden in the implementing class, but it is not mandatory
//Interfaces methods and variables are public by default
interface Cycle {
    //      You can create Properties in a interface
    int x = 4;

    void breaking(double decrement);

    void speeding(double increment);
}

interface MountainCycle {
    void widertires();

    void bottleholder();
}

class Avoncycle implements Cycle, MountainCycle {
    //     int x = 45;    Updating properties in the implementing class --> Allowed
    void horn() {
        System.out.println("HONK !!!!!!");
    }

    public void breaking(double decrement) {
        System.out.println("Reducing the speed by " + decrement + " km/hour");
    }

    public void speeding(double increment) {
        System.out.println("increasing the speed by " + increment + " km/hour");
    }

    public void widertires() {
        System.out.println("The tires of this cycle is wider");
    }

    public void bottleholder() {
        System.out.println("Holding the bottle");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Avoncycle cycle = new Avoncycle();
//        Cycle c = new Avoncycle();   --> Allowed
//        Cycle b = new Cycle();    --> Not allowed
//        You can create a reference of an interface but not an object


        cycle.breaking(0.5);
        cycle.speeding(1.7);
        System.out.println(cycle.x);

//        You CANNOT modify the properties in Interface as they are final
//        cycle.x = 8;      --Not allowed
        cycle.widertires();
        cycle.bottleholder();

    }
}
