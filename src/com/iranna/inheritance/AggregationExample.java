package com.iranna.inheritance;

// Class to represent a Circle
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

// Class to calculate the area of a Circle (aggregation example)
class AreaCalculator {
    private Circle circle; // Aggregation: Circle is used as an instance variable

    // Constructor to associate a Circle object
    public AreaCalculator(Circle circle) {
        this.circle = circle;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }
}

// Main Class
public class AggregationExample {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);

        // Pass the Circle object to AreaCalculator
        AreaCalculator calculator = new AreaCalculator(circle);

        // Calculate the area of the circle
        double area = calculator.calculateArea();

        // Print the area
        System.out.println("The area of the circle is: " + area);
    }
}
