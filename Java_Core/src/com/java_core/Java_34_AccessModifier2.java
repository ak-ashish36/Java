/*
        SameClass SamePackage Subclass World
Public      Y           Y         Y      Y
Protected   Y           Y         Y      N
Default     Y           Y         N      N
Private     Y           N         N      N

 */
package com.java_core;
import com.ashish.Ashish;

class AccessModifier2{
    public int a =5;
    protected int b=10;
    int c =15;
    private int d =20;
    //Private can be accessed only within the class
    void printd(){
        System.out.println(d);
    }
}

// Java_34_AccessModifier2 is the subclass of class Ashish which is from different package
public class Java_34_AccessModifier2 extends Ashish {

    public static void main(String[] args) {
        
        //Accessing Protected member of class Ashish which is from different package
        System.out.println("Using class properties of different class from different package related to class of this package");
        Java_34_AccessModifier2 am =new Java_34_AccessModifier2();
        System.out.print(am.a+" ");   //Public in Ashish
        System.out.print(am.b+" \n");   //Protected in Ashish
//        System.out.println(am.c);   //error-->Default in Ashish

        //Using class from different package which is not related to any class of this package
        System.out.println("Using class properties of different class from different package not related to class of this package");
        Ashish as = new Ashish();
        System.out.print(as.a+" \n");   //Public in Ashish
//        System.out.println(as.b);   //error-->Protected in Ashish
//        System.out.println(am.c);   //error-->Default in Ashish

    }
}

