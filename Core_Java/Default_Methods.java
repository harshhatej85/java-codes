package Core_Java;

// Default methods can be created inside interfaces and also be declared and can be used/overridden by any implementing class
interface camera {
    void TakingPhoto();

    void RecordingVideo();

    //    Private methods is used in interfaces to manage large amount of methods for default method
    private void BurstShoot() {
        System.out.println("Shooting photos in burst mode");
    }

    default void Record4kVideo() {
        BurstShoot();
        System.out.println("Recording in 4k 30FPS ");
    }
}

interface wifi {
    String[] showAvailableNetworks();

    void connectToNetwork();
}

class MyCellPhone {
    void callNumber(long number) {
        System.out.println("Calling the number " + number);
    }

    void reciveCall() {
        System.out.println("Call Accepted");
    }
}

class MySmartPhone extends MyCellPhone implements camera, wifi {
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

    public void Record4kVideo() {
        System.out.println("Recording in 4k 60FPS ");
    }
}

public class Default_Methods {
    public static void main(String[] args) {
        MySmartPhone nord = new MySmartPhone();
//        nord.callNumber(1001154095);
//        nord.reciveCall();
//        nord.TakingPhoto();
//        nord.RecordingVideo();
//        nord.Record4kVideo();
        String[] ar = nord.showAvailableNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
        System.out.println();
        nord.connectToNetwork();
//        nord.BurstShoot();  --> Not allowed
    }
}
