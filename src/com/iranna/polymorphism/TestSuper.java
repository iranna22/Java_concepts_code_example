package com.iranna.polymorphism;


class Sup{  
Sup(){System.out.println("animal is created");} 
Sup(String name){
	System.out.println("animal with parameter is created");
}
}  
class Sub extends Sup{  
Sub(){  
super("gdg");  
System.out.println("dog is created");  
}  
Sub(String n){  
	super("dg");  
	System.out.println("dog with parameter is created");  
	}  

}  
class TestSuper{  
public static void main(String args[]){  
Sub d=new Sub(); 
Sub d1=new Sub("myname"); 
}}  