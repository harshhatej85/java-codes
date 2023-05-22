package Advance_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Practise_Set_15 {
    public static void main(String[] args) {

//        Problem 1
//        Create an ArrayList and store the names of ten students inside it.
//        Print it using a for each loop.
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Tina");
        l1.add("Jack");
        l1.add("Aman");
        l1.add("Shubh");
        l1.add("Krish");
        l1.add("Rohit");
        l1.add("Rahul");
        l1.add("Ajay");
        l1.add("Sohan");

        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
        }


//        Problem 2
//        Question 2: Use the Date class in Java to print the time in the following format :
//        21:47:02.

        Date d = new Date();
        System.out.println(d.getSeconds() + ":" + d.getMinutes() + ":" + d.getHours());


//        Problem 3
//        Repeat question number 2 using the Calendar class.
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.SECOND) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.HOUR_OF_DAY));


//        Problem 4
//        Repeat question number 2 using java.time API.
        LocalDateTime t1 = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("ss:mm:kk");

        String S1 = t1.format(df);
        System.out.println(S1);


//        Problem 5
//        Create a Set in java. Try to store the duplicate values elements
//        inside this set and verify that only one instance is stored.
        Set<Integer> s = new HashSet<>();
        s.add(44);
        s.add(3);
        s.add(26);
        s.add(3);
        s.add(26);
        s.add(44);
        s.add(33);

        System.out.println(s);

    }
}
