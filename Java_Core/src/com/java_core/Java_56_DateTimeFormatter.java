package com.java_core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_56_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy --E --a");
        DateTimeFormatter df2= DateTimeFormatter.ISO_ORDINAL_DATE;

//        String date =dt.format(df);
        String date =dt.format(df2);
        System.out.println(date);
    }
}
