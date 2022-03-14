package com.java_core;
class Base1{
    Base1(){
        System.out.println("I am Base class constructor");
    }
    //Constructor overloading
    Base1(int x){
        System.out.println("I am Base class constructor with value of x:"+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        //super() is used to call cosntructor of parent class
//        super(6);
        System.out.println("I am Derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am Derived class constructor with value of y:"+y);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am child of derived class");
    }
    childOfDerived(int x,int y, int z){
        super(x,y);
        System.out.println("I am child of derived class with value of z:"+z);
    }
}
public class Java_26_InheritanceConstructor {
    public static void main(String[] args) {
//        Base1 obj =new Base1();
//        Derived1 obj =new Derived1(8,9);
        childOfDerived obj=new childOfDerived(1,2,3);
    }


}

