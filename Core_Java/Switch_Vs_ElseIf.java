package Core_Java;

public class Switch_Vs_ElseIf {
    public static void main(String[] args) {
        //Switch case is used when we have to make a choise between
        //number of alternatives for a given variable
        //(var) can be a String,integer and character in  java
        String var = "AOT";


//      Traditional Switch Statement (Requires break keyword)
//        switch (var) {
//            case "AOT":
//                System.out.println("Shinzo Sasageyo!!!");
//                break;
//            case "Demon Slayer":
//                System.out.println("Tanjiro");
//                break;
//            case "OnePunchMan":
//                System.out.println("Bald");
//                break;
//            default:
//                System.out.println("Defaulted");
//        }


//      Enhanced Switch Statement (Does not require break keyword)
//        switch (var) {
//            case "AOT" -> System.out.println("Shinzo Sasageyo!!!");
//            case "Demon Slayer" -> System.out.println("Tanjiro");
//            case "OnePunchMan" -> System.out.println("Bald");
//            default -> System.out.println("Defaulted");
//        }


        //Normal if else ladder :
//        System.out.println("Enter you age: ");
//        Scanner sc = new Scanner(System.in);
//        byte age = sc.nextByte();
//        if (age > 56) {
//            System.out.println("You are Very Experienced.");
//        } else if (age > 46) {
//            System.out.println("You are Experienced.");
//        } else if (age > 36) {
//            System.out.println("You are Semi Experienced.");
//        } else {
//            System.out.print("You are not Experienced. ");
//        }
//        if (age > 2 && age < 10) {
//            System.out.println("You are a baby!");
//        }
    }
}
