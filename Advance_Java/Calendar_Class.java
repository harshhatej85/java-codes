package Advance_Java;

import java.util.Calendar;
import java.util.TimeZone;

public class Calendar_Class {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());    // shows the ID of current time zone

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asis/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}
