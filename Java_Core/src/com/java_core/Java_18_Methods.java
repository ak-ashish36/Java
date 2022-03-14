package com.java_core;
public class Java_18_Methods {
    static int func(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        // Method invocation using Object creation
//        Java_18_Methods obj =new Java_18_Methods();
//        c = obj.func(a, b);

        c = func(a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = func(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}


