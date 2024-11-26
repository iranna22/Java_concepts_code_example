package com.iranna.oops;

class Example {
    int value;

    // Constructor
    Example(int value) {
        this.value = value;

        // Call a method from the constructor
        displayMessage();

        // Create another object inside the constructor
        Helper helper = new Helper();
        helper.showHelperMessage();
    }

    // Method to display a message
    void displayMessage() {
        System.out.println("Constructor is called. Value is initialized to: " + value);
    }
}

class Helper {
    // Method in the Helper class
    void showHelperMessage() {
        System.out.println("Helper object created. Performing some action...");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating an object of Example
        Example obj = new Example(10);
    }
}
