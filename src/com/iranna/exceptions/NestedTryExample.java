package com.iranna.exceptions;


public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started.");

            int result = 10 / 2; // No exception here
            System.out.println("Result: " + result);

            try {
                // Inner try block
                System.out.println("Inner try block started.");
                
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException in inner catch block: " + e.getMessage());
            }

            // This will throw a NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in outer catch block: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in outer catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program execution continues...");
    }
}

