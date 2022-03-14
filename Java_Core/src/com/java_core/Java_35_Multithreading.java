//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

//Both methods of the classes run simultaneosly
package com.java_core;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("I am Cooking");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("I am Chatting");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Java_35_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}

