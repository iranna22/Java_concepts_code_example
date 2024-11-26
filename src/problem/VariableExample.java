package problem;

public class VariableExample {
    // Static variable (belongs to the class, shared among all instances)
    static int staticVariable = 10;

    // Instance variable (belongs to an instance of the class)
    int instanceVariable;

    // Constructor to initialize the instance variable
    public VariableExample(int value) {
        this.instanceVariable = value;
    }

    public void displayVariables(int a) {
        // Local variable (declared inside a method, exists only during method execution)
        int localVariable=a;

        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        // Accessing and modifying static variable
        System.out.println("Initial Static Variable: " + staticVariable);
        staticVariable = 20;

        // Creating objects to demonstrate instance variable
        VariableExample obj1 = new VariableExample(100);
        VariableExample obj2 = new VariableExample(200);

        // Displaying variables for each object
        System.out.println("Object 1:");
        obj1.displayVariables(4);

        System.out.println("\nObject 2:");
        obj2.displayVariables(8);
    }
}
