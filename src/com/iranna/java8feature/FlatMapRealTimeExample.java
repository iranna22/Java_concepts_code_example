package com.iranna.java8feature;

import java.util.*;
import java.util.stream.Collectors;

class Products {
    private String name;

    public Products(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private List<Products> Productss;

    public Order(List<Products> Productss) {
        this.Productss = Productss;
    }

    public List<Products> getProductss() {
        return Productss;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class FlatMapRealTimeExample {
    public static void main(String[] args) {
        // Creating Productss
        Products p1 = new Products("Laptop");
        Products p2 = new Products("Phone");
        Products p3 = new Products("Tablet");
        Products p4 = new Products("Headphones");

        // Creating orders
        Order order1 = new Order(Arrays.asList(p1, p2));
        Order order2 = new Order(Arrays.asList(p3));
        Order order3 = new Order(Arrays.asList(p2, p4));

        // Creating customers with orders
        Customer customer1 = new Customer("Alice", Arrays.asList(order1, order2));
        Customer customer2 = new Customer("Bob", Arrays.asList(order3));

        List<Customer> customers = Arrays.asList(customer1, customer2);

        // Using flatMap() to get a unique list of all ordered Products names
        List<String> allOrderedProductss = customers.stream()
                .flatMap(customer -> customer.getOrders().stream())   // Flatten orders
                .flatMap(order -> order.getProductss().stream())       // Flatten Productss
                .map(Products::getName)                                // Extract Products names
                .distinct()                                           // Remove duplicates
                .collect(Collectors.toList());

        System.out.println("All unique Productss ordered: " + allOrderedProductss);
    }
}
