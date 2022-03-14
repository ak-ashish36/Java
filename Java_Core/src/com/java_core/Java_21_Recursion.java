package com.java_core;
public class Java_21_Recursion {
    static int fact_recursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int fact = n * fact_recursion(n - 1);
            return fact;
        }
    }
    static int fact_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int x=n;
            for(int i=n-1;i>1;i--){
                x=x*i;
            }
            return x;
        }
    }
    public static void main(String[] args) {
        System.out.println(fact_recursion(8));
        System.out.println(fact_iterative(8));
    }
}
