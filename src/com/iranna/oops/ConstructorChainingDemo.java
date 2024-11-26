package com.iranna.oops;


class Vehicle {
    // Constructor with no parameters
    Vehicle() {
        this("Default Vehicle");
        System.out.println("Vehicle: No-argument constructor");
    }

    // Constructor with one parameter
    Vehicle(String name) {
        System.out.println("Vehicle: One-argument constructor, Name: " + name);
    }
}

class Bike extends Vehicle {
    // Constructor with no parameters
    Bike() {
        this(4);
        System.out.println("Bike: No-argument constructor");
    }

    // Constructor with one parameter
    Bike(int wheels) {
        super("Car");
        System.out.println("Bike: One-argument constructor, Wheels: " + wheels);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("Creating a Vehicle instance:");
        Vehicle vehicle = new Vehicle();

        System.out.println("\nCreating a Bike instance:");
        Bike bke = new Bike();
    }
}
