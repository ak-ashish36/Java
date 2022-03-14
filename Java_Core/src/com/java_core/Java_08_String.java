package com.java_core;
import java.util.Scanner;

public class Java_08_String {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f \n", a, b);
        System.out.format("The value of a is %d and value of b is %f \n", a, b);
        Scanner sc = new Scanner(System.in);
       String st = sc.next();
    //    String st = sc.nextLine();
       System.out.println(st);

        char [] str={'A','s','h','i','s','h'};
        System.out.println(str);

    }
}
