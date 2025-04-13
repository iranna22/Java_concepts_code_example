package com.iranna.inheritance;

class Aclass {
	int a;

	public Aclass() {
		System.out.println("super class A default const");
	}

	public Aclass(int a) {
		this.a=a;
		System.out.println("Aclass cont a: "+a);
	}
	void sayHi() {

	}
}

class B extends Aclass {
	int b;

	public B() {
		System.out.println("subclas B  default const");
	}
	public B(int b) {
		super(3);
		this.b=b;
		System.out.println("B const b "+b);
	}

	void sayBye() {
		//super();
		System.out.println("bye from B");
		
	}
}

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
//    private String showPrivate(String s) {
//        System.out.println("Parent private method "+s);
//    }
    // final method can be inherited but can't be overridden
    final void fly() {
        System.out.println("Parent final method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
    //private method can't be inherited
//    private String showPrivate(String s) {
//        System.out.println("Parent private method "+s);
//    }
//    final void fly() {
//        System.out.println("Child final method");
//    }
}

public class SuperDemo {
	public static void main(String[] args) {

	//	B b = new B();
	//	B b1 = new B(6);
		Parent p = new Child();
		Child  c = new Child();
        p.show();
        p.fly();
      //  c.show();
       // c.showPrivate("some");

	}

}
