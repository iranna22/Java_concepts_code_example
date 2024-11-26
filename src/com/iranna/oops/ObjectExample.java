package com.iranna.oops;

//initialising object 
class Student{  
	 int id;  
	 String name;  
	} 
class Car{
	int seats;
	String color;
	void insertRecords(int a,String b) {
		seats=a;
		color=b;
	}
	void displayRecords() {
		System.out.println(this+" "+ seats+" "+color);
	}
}
class Person{
	int id;
	String name;
	public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }
	
}
public class ObjectExample {
	public static void main(String args[]){  
		 Student s1=new Student();  
		  Student s2=new Student();  
		  //Initializing objects  with ref variable
		  s1.id=101;  
		  s1.name="Sonoo";  
		  s2.id=102;  
		  s2.name="Amit";  
		  //Printing data  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name); 
		  //Initialization objects through method
		  Car c1 =  new Car();
		  Car c2 = new Car();
		  c1.insertRecords(5,"white");
		  c2.insertRecords(7, "black");
		  c1.displayRecords();
		  c2.displayRecords();
		  
		// Creating Employee objects using the constructor
	        Person p1 = new Person(101, "Alice");
	        Person p2 = new Person(102, "Bob");

	        // Displaying the details of the employees
	        System.out.println("Person 1: ID = " + p1.getId() + ", Name = " + p1.getName());
	        System.out.println("Person 2: ID = " + p2.getId() + ", Name = " + p2.getName());
		  
		 }  
}

	