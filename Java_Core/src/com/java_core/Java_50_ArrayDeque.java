package com.java_core;
import java.util.*;
public class Java_50_ArrayDeque{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>(3);//initial capacity is 3 but size will increase automatically with needs
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.add(4);

        ad1.addFirst(0);
        ad1.offerFirst(00);
        ad1.addLast(98);
        ad1.offerLast(99);

        System.out.println(ad1);

        //ctrl+q to read the documentation
//        ad1.remove();  //Removes first element of the queue
//        ad1.remove(4); //Removes the element 4;
//        ad1.removeFirst();
//        ad1.removeLast();
//        ad1.pollFirst();
//        ad1.poll();        //Removes first element of the queue
//        ad1.pollLast();

//        System.out.println(ad1.element());  //retrive the first element
//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.getLast());
//        System.out.println(ad1.peek());
//        System.out.println(ad1.peekFirst());
//        System.out.println(ad1.peekLast());

        System.out.println(ad1);

        // Using iterator()
        Iterator<Integer> iterate = ad1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.println(ad1.contains(98));



    }
}
