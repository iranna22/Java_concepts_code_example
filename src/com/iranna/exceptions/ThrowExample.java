package com.iranna.exceptions;


public class ThrowExample {

    // A method to validate age
    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing an exception if age is less than 18
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
       try {
            // Testing with an invalid age
            validateAge(16);
        } catch (IllegalArgumentException e) {
            // Catching and handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        } 
        // Testing with a valid age
        validateAge(21);
    	System.out.println("after exception");

    }
}
