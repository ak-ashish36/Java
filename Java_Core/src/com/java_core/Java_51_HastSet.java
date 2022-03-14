package com.java_core;
import java.util.*;
public class Java_51_HastSet{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(3));
        // Using iterator()
        Iterator<Integer> iterate = myHashSet.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(" ");
        }

    }
}


