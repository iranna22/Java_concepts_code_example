package com.iranna.java8feature;


import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + age + " years, $" + salary + ", " + department + ")";
    }
}

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 30, 70000, "IT"),
                new Employee(2, "Bob", 45, 85000, "Finance"),
                new Employee(3, "Charlie", 25, 60000, "HR"),
                new Employee(4, "David", 35, 90000, "IT"),
                new Employee(5, "Eve", 28, 50000, "Finance"),
                new Employee(6, "Frank", 40, 75000, "HR"),
                new Employee(7, "Grace", 32, 80000, "IT"),
                new Employee(8, "Alice", 30, 70000, "IT") // Duplicate
        );

        // 1. filter(): Employees earning more than $70,000
        List<Employee> highEarners = employees.stream()
                .filter(emp -> emp.salary > 70000)
                .collect(Collectors.toList());
        System.out.println("Employees earning more than $70,000: " + highEarners);

        // 2. map(): Get names of all employees
        List<String> employeeNames = employees.stream()
                .map(emp -> emp.name)
                .collect(Collectors.toList());
        System.out.println("Employee Names: " + employeeNames);

        // 3. sorted(): Sort employees by age
        List<Employee> sortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(emp -> emp.age))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by age: " + sortedByAge);

        // 4. forEach(): Print all employees
        System.out.println("All Employees:");
        employees.stream().forEach(System.out::println);

        // 5. collect(): Group employees by department
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));
        System.out.println("Employees grouped by department: " + groupedByDept);

        // 6. reduce(): Get total salary of all employees
        double totalSalary = employees.stream()
                .map(emp -> emp.salary)
                .reduce(0.0, Double::sum);
        System.out.println("Total Salary of all employees: $" + totalSalary);

        // 7. count(): Count employees in IT department
        long itDeptCount = employees.stream()
                .filter(emp -> emp.department.equals("IT"))
                .count();
        System.out.println("Number of employees in IT department: " + itDeptCount);

        // 8. anyMatch(), allMatch(), noneMatch()
        boolean anyHighEarner = employees.stream().anyMatch(emp -> emp.salary > 90000);
        boolean allAbove50k = employees.stream().allMatch(emp -> emp.salary > 50000);
        boolean noneBelow25 = employees.stream().noneMatch(emp -> emp.age < 25);
        System.out.println("Any employee earns more than $90,000? " + anyHighEarner);
        System.out.println("All employees earn more than $50,000? " + allAbove50k);
        System.out.println("No employee is younger than 25? " + noneBelow25);

        // 9. findFirst(): Get the first employee
        Optional<Employee> firstEmployee = employees.stream().findFirst();
        firstEmployee.ifPresent(emp -> System.out.println("First Employee: " + emp));

        // 10. findAny(): Get any employee
        Optional<Employee> anyEmployee = employees.stream().findAny();
        anyEmployee.ifPresent(emp -> System.out.println("Any Employee: " + emp));

        // 11. distinct(): Remove duplicate employees
        List<Employee> distinctEmployees = employees.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Employees: " + distinctEmployees);

        // 12. limit(): Get first 3 employees
        List<Employee> firstThreeEmployees = employees.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("First 3 Employees: " + firstThreeEmployees);

        // 13. skip(): Skip first 3 employees
        List<Employee> skippedEmployees = employees.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("Employees after skipping first 3: " + skippedEmployees);
    }
}
