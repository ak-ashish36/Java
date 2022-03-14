package com.java_core;
import java.util.*;
public class Java_48_ArrayList{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(2); //initial capacity is 2 but size will increase automatically with needs
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(1,5); //it will add the element at the given index and next element will be pushed back
        l2.set(0,44); //it will replace the element at the given index.
//        l2.clear(); //clears the array;
        l2.remove(2); //removes 5 which is at index 1;
        l2.remove(new Integer(44)); //remove the value 44

        System.out.println("\nL2 Array list : " +l2);
        l1.addAll(l2);
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));



    }
}
