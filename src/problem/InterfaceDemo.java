package problem;


interface MyInterface {
    // Default method
    default void showDefault() {
        System.out.println("This is a default method in the interface.");
    }

    // Static method - its not inherited by impl class
    static void showStatic() {
        System.out.println("This is a static method in the interface.");
    }
    
    void myMethod();
}

class MyClass implements MyInterface {
    // Optionally override the default method
    @Override
    public void showDefault() {
        System.out.println("Default method overridden in the implementing class.");
    }
    
    //
     void showStatic() {
        System.out.println("This is a static method in the myclass.");
    }
	@Override
	public void myMethod() {
		System.out.println("abstarct method impl");
	}
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Accessing default method
        MyClass obj = new MyClass();
        obj.showDefault(); // Call the overridden version of the default method
        obj.showStatic();
        // Accessing static method
        MyInterface.showStatic(); // Call the static method directly using the interface name
        
        obj.myMethod();
    }
}
