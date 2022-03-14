package com.java_core;
public class Java_14_BreakAndContinue {
    public static void main(String[] args) {

        //using for loop
        System.out.println("Using Break");
        for(int i=1;i<=5;i++){
            if(i==7){
                break;   //break the loop
            }
            System.out.print(i+" ");
        }
//      Continue-->The continue statement is used to immediately move to the next iteration of the loop.
        System.out.println("\nUsing Continue");
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;//continue skips the rest statement
            }
            System.out.print(i+" ");
        }
    }
}
