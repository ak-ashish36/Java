package com.java_core;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}

public class Java_38_ThreadPriorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Thread1");
        MyThr1 t2 = new MyThr1("Thread2");
        MyThr1 t3 = new MyThr1("Thread3");
        MyThr1 t4 = new MyThr1("Thread4 (most Important)");
        MyThr1 t5 = new MyThr1("Thread5");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
