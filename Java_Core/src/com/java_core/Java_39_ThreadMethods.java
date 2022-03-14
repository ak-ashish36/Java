//The join() method in Java allows one thread to wait until the execution of some other specified thread is completed.
//The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
//A thread in a sleeping or waiting state can be interrupted by another thread with the help of the interrupt() method of the Thread class.
//The interrupt() method throws InterruptedException.
package com.java_core;
class MyNewThr1 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Thread 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Thread 2");

        }
    }
}

public class Java_39_ThreadMethods {

        public static void main (String[]args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();

//        try{
//            t1.join();
//        }//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();
        t2.interrupt();

    }
}


