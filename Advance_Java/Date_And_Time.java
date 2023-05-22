package Advance_Java;

import java.util.Date;

public class Date_And_Time {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());                         // MilliSeconds passer after 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000);                  // Minutes passed after 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600);           // Hours passed after 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24);      // days passed after 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);// Year passed after 1 jan 1970 (Approx)

//      Quick quiz: Is it safe to store the no. of ms in a variable of type long?
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
//      Hence it is safe to store Milliseconds in Long data type

//        DATE CLASS IN JAVA :
        Date d = new Date();
        System.out.println(d);              // Outputs current date and time
        System.out.println(d.getTime());    // Returns the number of milliseconds since January 1, 1970

//      Deprecated Methods :
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMonth());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.getYear());


    }
}
