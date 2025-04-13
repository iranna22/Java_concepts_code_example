package com.iranna.java8feature;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapFlatMapExample {
    public static void main(String[] args) {
        // Example of map() method
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                                         .map(String::length) // Transform each name to its length
                                         .collect(Collectors.toList());

        System.out.println("Using map(): " + nameLengths); // Output: [5, 3, 7]

        // Example of flatMap() method
        List<List<String>> nestedList = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e"),
            Arrays.asList("f", "g", "h")
        );

        List<String> flatList = nestedList.stream()
                                          .flatMap(List::stream) // Flatten the nested lists
                                          .collect(Collectors.toList());

        System.out.println("Using flatMap(): " + flatList); // Output: [a, b, c, d, e, f, g, h]
    }
}
