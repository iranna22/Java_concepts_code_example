package com.iranna.collections;


import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("arraylist: ");
        // Iterate over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Create a HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(11);
        numbers.add(16);
        numbers.add(10); // Duplicate will be ignored
        
        System.out.println("hashset:");
     // Iterate over the HashSet
        for (int number : numbers) {
            System.out.println(number);
        }

        // Create a HashMap
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);

        // Access values from the map
        System.out.println("Access values from the map: "+ages.get("Alice"));
    }
}