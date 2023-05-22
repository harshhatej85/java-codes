package Core_Java;

//You can use polymorphism in interfaces by using interface name as reference and class name as object for secure and private purposes
interface camera2 {
    void TakingPhoto();

    void RecordingVideo();
}

interface wifi2 {
    String[] showAvailableNetworks();

    void connectToNetwork();
}

class MyCellPhone2 {
    void callNumber(long number) {
        System.out.println("Calling the number " + number);
    }

    void reciveCall() {
        System.out.println("Call Accepted");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements camera2, wifi2 {
    public void TakingPhoto() {
        System.out.println("Capturing");
    }

    public void RecordingVideo() {
        System.out.println("Recording");
    }

    public String[] showAvailableNetworks() {
        System.out.println("Getting list of Available Networks...");
        String[] networks = {"Jio fiber", "Airtel Xstream", "Hathway ", "Pixel 6 pro"};
        return networks;
    }

    public void connectToNetwork() {
        System.out.println("Connected");
    }

}

public class Polymorphism {
    public static void main(String[] args) {

        camera2 cam = new MySmartPhone2();       // --> It allows to use only  methods created in camera2 interface and throws an error is method of any other interface is called
//      cam.connectToNetwork();     // --> Throws an error / not allowed
//      cam.showAvailableNetworks();     // --> Throws an error / not allowed

//      You can bypass this by casting class name to object for higher privileges :
//      ((MySmartPhone2) cam).callNumber(34534534);

        cam.RecordingVideo();
        cam.TakingPhoto();

//        NOTE :
//        You must define entire methods of the referencing interface in this case i.e. -->
//        implementing an interface forces method/s implementation
    }
}
