package com.java_core;
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning from child2");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon from child 2");
    }
}
//child3 class must override all the abstract method of base class.if not so than this class should also be abstract class
abstract class Child3 extends Parent2{
    public void greet(){
        System.out.println("Good morning from child3");
    }
    public void th(){
        System.out.println("I am good");
    }
}
public class Java_29_AbstractClass{
    public static void main(String[] args) {
//        Parent2 p = new Parent2(); // -- error abstract class cannot be instantiated
        Child2 c = new Child2();
        c.greet();
//        Child3 c3 = new Child3(); // -- error abstract class cannot be instantiated
    }
}
