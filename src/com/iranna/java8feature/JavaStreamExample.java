package com.iranna.java8feature;


import java.util.*;  
import java.util.stream.Collectors;  
class Products1{  
    int id;  
    String name;  
    float price;  
    public Products1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Products1> ProductsList = new ArrayList<Products1>();  
        //Adding Productss  
        ProductsList.add(new Products1(1,"HP Laptop",25000f));  
        ProductsList.add(new Products1(2,"Dell Laptop",30000f));  
        ProductsList.add(new Products1(3,"Lenevo Laptop",28000f));  
        ProductsList.add(new Products1(4,"Sony Laptop",28000f));  
        ProductsList.add(new Products1(5,"Apple Laptop",90000f));  
        List<Float> ProductssPriceList2 =ProductsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(ProductssPriceList2);  
    }  
}  