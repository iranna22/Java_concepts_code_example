package com.iranna.java8feature;



interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    } 
//    void message();
//    void anotherMessage();
    
}  
@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg);   // abstract method  
}  

interface Parent {
    void parentMethod1();
    
}

@FunctionalInterface
interface Child extends Parent {
    // Override and combine into one abstract method
    @Override
    void parentMethod1();; // Functional Interface is valid because it overrides all abstract methods into one.
}

 class  ImplClass implements Sayable,Child{  
    public void say(String msg){  
        System.out.println(msg);  
    }

	@Override
	public void parentMethod1() {
    System.out.println("overridn by child");		
	}  
    
    
}  
 
 public class FunctionalInterfaceInheritance{
	 public static void main(String[] args) {
		 ImplClass fie = new ImplClass();  
	        fie.say("Hello there");  
	        fie.doIt();  
	        fie.parentMethod1();
	}
 }


