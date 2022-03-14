package com.java_core;

import java.util.*;
public class Java_54_GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar : " + c.getTime());

        System.out.println("The hashcode for this calendar is : "+ c.hashCode());
        System.out.println(c.isLeapYear(2000));
        System.out.println(c.isLeapYear(2021));

        System.out.println("Date before rolling : " + c.getTime());
        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + c.getTime());

        System.out.println("The hashcode for this calendar is : "+ c.hashCode());
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        System.out.println(c.getTimeZone().getID());
    }
}
