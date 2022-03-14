package com.java_core;
class StaticFinal {

    public String name;
    public static String description;

    public static int count=0;
    public int id;

    public StaticFinal() {
        id=count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);

    }

    public static void showInfo() {
        System.out.println(description);
//        System.out.println(name); //Static objects/methods cant access non static
    }
    public final static int LUCKY_NUMBER = 7; //final objects must be initialized at beginning
}


public class Java_22_StaticAndFinal {

    public static void main(String[] args) {

        StaticFinal obj1 = new StaticFinal();
        StaticFinal obj2 = new StaticFinal();

        //Calling non static methods
        obj1.name = "Bob";
        obj2.name = "Sue";

        //Static properties/methods value are same for all the objects
//        obj1.description ="I am the description 1";
//        obj2.description ="i am description 2";
        StaticFinal.description ="I am same description for all";
        obj1.showName();
        obj2.showName();

        StaticFinal.showInfo();

//        System.out.println(Math.PI);
//
//        System.out.println(Thing.LUCKY_NUMBER);
    }

}