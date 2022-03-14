package com.java_core;
import java.util.Scanner;

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class Java_44_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age =sc.nextInt();
        if(age>125){
            try {
                throw new MaxAgeException();
//                throw new ArithmeticException("This is an exception"); //custom message in built in exception
            }
            catch (Exception e){
                System.out.println(e);      //by default it is e.toString()
                System.out.println(e.getMessage());
                e.printStackTrace(); //use to point out the error line
            }
        }

    }
}
