package com.iranna.java8feature;
import java.util.*;
import java.util.stream.Collectors;
  
 class Actors {
    private String name;
    private String gender;

    public Actors(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}



public class CollectorsMethods {
    public static void main(String[] args) {
        List<Actors> actors = Arrays.asList(
            new Actors("Tom Hanks", "Male"),
            new Actors("Emma Watson", "Female"),
            new Actors("Chris Evans", "Male"),
            new Actors("Scarlett Johansson", "Female")
        );

        // 1. Get a List of Actor names
        List<String> names = actors.stream()
            .collect(Collectors.mapping(Actors::getName, Collectors.toList()));
        System.out.println("Names: " + names);

        // 2. Join all names into a single string
        String joinedNames = actors.stream()
            .map(Actors::getName)
            .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);

        // 3. Count total number of actors
        long count = actors.stream()
            .collect(Collectors.counting());
        System.out.println("Total number of actors: " + count);
    }
}

