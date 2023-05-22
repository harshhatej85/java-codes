package Core_Java;

class Phone {
    public void time() {
        System.out.println("The time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone....");
    }
}

class SmartPhone extends Phone {
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone....");
    }

    public void music() {
        System.out.println("Playing music....");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone();         //Allowed
//        SmartPhone obj2 = new SmartPhone();     //Allowed
//        obj.on();

        Phone obj3 = new SmartPhone(); //This is allowed
//        SmartPhone obj4 = new Phone(); This is not allowed

        obj3.time();
        obj3.on();
//      obj3.music();   Not allowed
    }
}
