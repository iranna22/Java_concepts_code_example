package com.iranna.polymorphism;


public class AreaCalculator {

    // Calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Calculate area of a triangle
    //third argument for understanding polymorphism
    public double calculateArea(double base, double height, boolean isTriangle) {
    	if (isTriangle) {
            return 0.5 * base * height; // Calculate triangle area
        } else {
            throw new IllegalArgumentException("This method is for triangles only.");
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Circle
        System.out.println("Area of Circle: " + calculator.calculateArea(5.0));

        // Rectangle
        System.out.println("Area of Rectangle: " + calculator.calculateArea(4.0, 6.0));

        // Triangle
        System.out.println("Area of Triangle: " + calculator.calculateArea(4.0, 5.0, true));
    }
}
