package problem;

class StaticClass {
    // Instance variable
    private String message = "This is an instance variable.";
    static String  college;
    // Static method
    // static method can only access static members
    static void display() {
        System.out.println("This is a static method."+" "+"static variable"+college);
        
    }
    //static block
    static {
    	college = "BITS";
        System.out.println("Static block executed.");
    }

    // Instance method can access both instance and static members
    void showMessage() {
        System.out.println("Instance method accessing instatnce variable: " + message);
        System.out.println("Instance method accessing static variable:"+college);
    }

    // Non-static method that accesses the instance variable and another instance method
    void accessInstanceFeatures() {
        System.out.println("Non-static method called.");
        System.out.println("Accessing instance variable: " + message);
        showMessage(); // Calling another instance method
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Calling static method without creating an object
        StaticClass.display();

        // Creating an instance to call non-static methods
        StaticClass instance = new StaticClass();
        instance.accessInstanceFeatures();
    }
}
