//Anonymous class is nothing but a class without any name.
//They are used to override a class method or interface.
//Anonymous classes in Java help us to write more concise and readable code.
package com.java_core;

interface Demo{
    void meth1();
    void meth2();
}

class ClassForDemo implements Demo{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
}

public class Java_59_Anonymous {
    public static void main(String[] args) {
//        Demo obj = new ClassForDemo();
//        obj.meth1();

        // Anonymous Class
        Demo obj = new Demo() {
            @Override
            public void meth1() {
                System.out.println("I am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2");
            }
        };
        obj.meth1();
        obj.meth2();
    }

}
