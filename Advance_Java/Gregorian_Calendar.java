package Advance_Java;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calendar {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2000));

//        Time Zones
        for (int i = 0; i < 631; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
