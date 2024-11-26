package com.iranna.inheritance;

//we can achieve multiple inheritance with interfaces. Not possible with class.
interface Interface1 {
    void display();
    void method1();
}

interface Interface2 {
    void display();
    void method2();
}

 class MyClass implements Interface1, Interface2 {
    @Override
    public void display() {
        System.out.println("Implementing display method from both interfaces");
    }

	@Override
	public void method2() {
		System.out.println("Method1 from Interface1");		
	}

	@Override
	public void method1() {
		System.out.println("Method1 from Interface1");		
	}
    
}

 public class MultiInheritanceWithInter {
	 public static void main(String[] args) {
		MyClass my = new MyClass();
		my.display();
		my.method1();
		my.method2();
		
 	}
	 
 }