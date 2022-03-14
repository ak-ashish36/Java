package com.java_core;
class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("Hello i am Runnable Thread");
    }
}
public class Java_37_ThreadConstructor2 {
    public static void main(String[] args) {
        MyThreadRunnable tr1 = new MyThreadRunnable();
        Thread t1 = new Thread(tr1,"Facebook");
        Thread t2 = new Thread(tr1,"Instagram");

        t1.start();
//        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());
    }
}
