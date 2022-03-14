package com.java_core;
import java.util.*;
public class Java_49_LinkedList{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

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
        l1.addAll(l2);
        System.out.println("\nL1 Array list after merging: "+ l1);

        l1.add(1,5); //it will add the element at the given index and next element will be pushed back
        l1.set(0,44); //it will replace the element at the given index.
//        l1.clear(); //clears the array;
        l1.remove(2); //removes 5 which is at index 1;
        l1.remove((Object)(44));//remove the value 44
        l1.addFirst(55);
        l1.addLast(99);
        l1.pop(); //removes the first element
        System.out.println("\nL1 Array list : " +l1);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));

        l1.sort(Comparator.naturalOrder());
        System.out.println("\nL1 Array list after sorting : " +l1);

    }
}
