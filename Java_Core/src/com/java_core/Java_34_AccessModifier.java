/*
        SameClass SamePackage Subclass World
Public      Y           Y         Y      Y
Protected   Y           Y         Y      N
Default     Y           Y         N      N
Private     Y           N         N      N

 */

package com.java_core;

class AccessModifier{
    public int a =5;
    protected int b=10;
    int c =15;
    private int d =20;
    //Private can be accessed only within the class
    void printd(){
        System.out.println(d);
    }

}



public class Java_34_AccessModifier{

    public static void main(String[] args) {
        AccessModifier obj =new AccessModifier();
        System.out.print(obj.a+" ");
        System.out.print(obj.b+" ");
        System.out.print(obj.c+" ");
        obj.printd();

        //Using Different class from same Package
        System.out.println("Using Differet class from same package");
        AccessModifier2 obj2 =new AccessModifier2();
        System.out.print(obj2.a+" ");
        System.out.print(obj2.b+" ");
        System.out.print(obj2.c+" ");

    }

}
