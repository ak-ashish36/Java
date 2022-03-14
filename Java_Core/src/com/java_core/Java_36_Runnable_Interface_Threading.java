//Runnable Interface Vs Extending Thread Class :
//Since we've discussed both the ways to create a thread in Java.
// There might be a question in your mind that should we use the Runnable interface or Thread class to implement a thread in Java.
// Let me answer this question for you.
// The Runnable interface is preferred over extending the Thread class because of the following reasons :
//
//1.As multiple inheritance is not supported in Java, it is impossible to extend the Thread class if your class had already extended some other class.
//2.While implementing Runnable, we do not modify or change the thread's behavior.
//3.More memory is required while extending the Thread class because each thread creates a unique object.
//4.Less memory is required while implementing Runnable because multiple threads share the same object.

package com.java_core;
class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Running Thread 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Running Thread 2");
        }
    }
}
public class Java_36_Runnable_Interface_Threading {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
