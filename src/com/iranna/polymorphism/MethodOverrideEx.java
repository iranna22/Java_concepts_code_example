package com.iranna.polymorphism;


class Animal {
	String color="brown";
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverrideEx {
    public static void main(String[] args) {
    	Dog dog =new Dog();
    	dog.sound();
        Animal myAnimal = new Dog();//creates Dog object,calls overridden method
        myAnimal.sound(); // Outputs: Dog barks
        Animal an = new Animal();//creates Animal object,calls Animal method
        //an.sound();
    }
}
