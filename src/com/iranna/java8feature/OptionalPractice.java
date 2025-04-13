package com.iranna.java8feature;

import java.util.Optional;

class Actor {
    int id;
    String name;
    String email;

    public Actor(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class OptionalPractice {
    public static void main(String[] args) {
        // Create an Actor object
        Actor actor = new Actor(1, "John Doe", null);

        // Wrapping email in Optional
        Optional<String> optionalEmail = Optional.ofNullable(actor.getEmail());

        // Using orElse() - provides default value if email is null
        String email1 = optionalEmail.orElse("No Email Provided");
        System.out.println("Using orElse: " + email1);

        // Using orElseGet() - uses a supplier to provide a default value
        String email2 = optionalEmail.orElseGet(() -> "Default Email");
        System.out.println("Using orElseGet: " + email2);

        // Using orElseThrow() - throws an exception if value is null
        try {
            String email3 = optionalEmail.orElseThrow(() -> new RuntimeException("Email is missing!"));
            System.out.println("Using orElseThrow: " + email3);
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Using ifPresent() - executes code only if value is present
        optionalEmail.ifPresent(email -> System.out.println("Email exists: " + email));
        
        // Handling Optional with map() - Transforming values if present
        Optional<Integer> emailLength = optionalEmail.map(String::length);
        System.out.println("Email length: " + emailLength.orElse(0));
    }
}
