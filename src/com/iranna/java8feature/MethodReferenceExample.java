package com.iranna.java8feature;


import java.util.Arrays;
import java.util.List;

class Logger {
    public static void log(String message) { // Static method
        System.out.println("Logging: " + message);
    }
}

class Employees {
    private String name;

    Employees(String name) { // Constructor
        this.name = name;
    }

    public String getName() { // Instance method
        return name;
    }

    public void printName() { // Instance method for reference
        System.out.println("Employees Name: " + name);
    }
}

// New class for instance method reference of a particular object
class EmployeesManager {
    public void showEmployeesName(Employees e) { // Instance method
        System.out.println("Managed Employees: " + e.getName());
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("User logged in", "File uploaded", "Payment processed");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // ✅ Static Method Reference
        messages.forEach(Logger::log);

        // ✅ Constructor Reference
        List<Employees> Employeess = names.stream()
                                        .map(Employees::new) // Equivalent to name -> new Employees(name)
                                        .toList();

        // ✅ Instance Method Reference (on an arbitrary object)
        Employeess.forEach(Employees::printName);
        

        // ✅ Instance Method Reference of a Particular Object
        EmployeesManager manager = new EmployeesManager();
        Employeess.forEach(manager::showEmployeesName);
    }
}
