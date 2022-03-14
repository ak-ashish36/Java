package com.java_core;
public class Java_20_VariableArguments {

        static  int sum(int a,int b){
            return a+b;
        }

        static  int sum(int a,int b,int c){
        return a+b+c;
        }
// Using variable arguments
        static int sum(int ...arr){
            // arguments are available as int [] arr
            int result = 0;
            for (int a : arr){
                result = result + a;
            }
            return result;
        }
        //Using variable arguments with one fixed agrument
//        static int sum(int x,int ...arr)


    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is:"+sum(2,3));
        System.out.println("Sum of 2,3,5 is:"+sum(2,3,5));
        System.out.println("Sum of 2,3,7,8  is:"+sum(2,3,7,8));
        System.out.println("Sum of 1 to 10  is:"+sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Sum of Nothing is:"+sum());
    }
}
