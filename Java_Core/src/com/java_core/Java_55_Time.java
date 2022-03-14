package com.java_core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_55_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalTime t1 = LocalTime.of(15,28,19);
        System.out.println("Time before : "  + t1);

        LocalTime t2= t1.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t2);

        LocalDate d1 = LocalDate.parse("2021-05-27");
        System.out.println(d1.withYear(2001));
        LocalDate d2= LocalDate.parse("2021-05-26");
        System.out.println(d1.equals(d));


    }
}