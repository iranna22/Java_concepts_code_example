package com.iranna.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * ArrayList: Ideal for random access and efficient retrieval of elements.
LinkedList: Ideal for frequent insertions and deletions, 
especially at the beginning or middle of the list.*/

public class AListLlist {
    public static void main(String[] args) {
        int size = 1000000;

        // Create a LinkedList and ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Populate both lists with the same elements
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Measure time to access the 2nd element in LinkedList
        long startTime = System.nanoTime();
        int secondElementLinkedList = linkedList.get(1);
        long endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        // Measure time to access the 2nd element in ArrayList
        startTime = System.nanoTime();
        int secondElementArrayList = arrayList.get(1);
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        System.out.println("Second element in LinkedList: " + secondElementLinkedList);
        System.out.println("Second element in ArrayList: " + secondElementArrayList);

        System.out.println("LinkedList access time: " + linkedListTime + " nanoseconds");
        System.out.println("ArrayList access time: " + arrayListTime + " nanoseconds");
    }
}