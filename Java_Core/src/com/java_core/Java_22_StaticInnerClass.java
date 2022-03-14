package com.java_core;
class Outer2 {
    int x=10;
    static int y=20;

    static class MyInner {
        public void show() {
            System.out.println(y);
        }
    }
}

public class Java_22_StaticInnerClass {
    public static void main(String[] args) {
        Outer2.MyInner m=new Outer2.MyInner();
        m.show();
    }
}