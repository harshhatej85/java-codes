package Advance_Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();     // This is date
//        System.out.println(dt);

        DateTimeFormatter b = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // This is the format

        String x = dt.format(b);  // Creating date string using date and format
        System.out.println(x);

    }
}
