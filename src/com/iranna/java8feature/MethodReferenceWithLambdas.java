package com.iranna.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Default Constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Static Method: Format Price
    public static String formatPrice(double price) {
        return String.format("$%.2f", price);
    }

    // Instance Method: Print Details
    public void printDetails() {
        System.out.println("Product Name: " + name + ", Price: " + formatPrice(price));
    }
}

public class MethodReferenceWithLambdas {
    public static void main(String[] args) {
        // Example 1: Static Method Reference
        Function<Double, String> priceFormatter = Product::formatPrice; // Using method reference
        Function<Double, String> lambdaPriceFormatter = (price) -> Product.formatPrice(price); // Using lambda
        System.out.println("Formatted Price (Method Reference): " + priceFormatter.apply(199.99));
        System.out.println("Formatted Price (Lambda): " + lambdaPriceFormatter.apply(199.99));

        // Example 2: Constructor Reference
        Supplier<Product> productCreator = Product::new; // Using constructor reference
        Supplier<Product> lambdaProductCreator = () -> new Product(); // Using lambda
        Product defaultProduct1 = productCreator.get(); // Calls the default constructor
        Product defaultProduct2 = lambdaProductCreator.get(); // Calls the default constructor
        System.out.println("Default Product (Method Reference): " + defaultProduct1.getName());
        System.out.println("Default Product (Lambda): " + defaultProduct2.getName());

        // Example 3: Instance Method Reference
        Product laptop = new Product("Laptop", 1200.50);
        Consumer<Product> productPrinter = Product::printDetails; // Using method reference
        Consumer<Product> lambdaProductPrinter = (product) -> product.printDetails(); // Using lambda
        System.out.println("Instance Method Reference:");
        productPrinter.accept(laptop); // Calls method reference
        System.out.println("Lambda Equivalent:");
        lambdaProductPrinter.accept(laptop); // Calls lambda equivalent

        // Example 4: Instance Method Reference (Arbitrary Object of a Class)
        List<Product> productList = Arrays.asList(
            new Product("Phone", 699.99),
            new Product("Tablet", 399.49),
            new Product("Headphones", 49.99)
        );

        System.out.println("Product List Details (Method Reference):");
        productList.forEach(Product::printDetails); // Using method reference
        System.out.println("Product List Details (Lambda):");
        productList.forEach(product -> product.printDetails()); // Using lambda
    }
}

