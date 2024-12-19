package com.iranna.java8feature;


import java.util.Optional;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email); // Wrapping email in Optional
    }
}

public class OptionalExample {
    public static void main(String[] args) {
        // User with an email
        User user1 = new User("Alice", "alice@example.com");

        // User without an email
        User user2 = new User("Bob", null);

        // Fetch and print emails
        printEmail(user1);
        printEmail(user2);
    }

    public static void printEmail(User user) {
        // Using Optional to handle possible null value
        String email = user.getEmail()
                           .orElse("No email provided");
        System.out.println(user.getName() + "'s Email: " + email);

        // Using ifPresent for optional actions
        user.getEmail().ifPresent(emailValue -> 
            System.out.println("Sending email to: " + emailValue)
        );
    }
}
