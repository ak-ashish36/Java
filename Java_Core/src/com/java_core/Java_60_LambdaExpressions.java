package com.java_core;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}


public class Java_60_LambdaExpressions {
    public static void main(String[] args) {

        // Lambda Expressions
// Lambda expressions is used to create a object of a class which directly implements a interface which have only one method
//        DemoAno obj = new HarryFunc();
//        obj.meth1();
        DemoAno obj = (a)->{
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}