// The throw keyword is used to throw an exception explicitly by the programmer
// Throws java throws keyword is used to declare an exception.
//This gives an information to the programmer that there might be an exception so its better to be prepared with a try catch block!
package com.java_core;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Java_45_ThrowVSThrows {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {

//        double ar = area(-5); // Cannot put withour try catch block
        try{
            double ar = area(-5);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

