package com.iranna.java8feature;


import java.util.*;
import java.util.stream.*;
  
class EmployeeOne {
    private String name;
    private String department;
    private double salary;

    public EmployeeOne(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<EmployeeOne> EmployeeOnes = Arrays.asList(
            new EmployeeOne("Alice", "HR", 50000),
            new EmployeeOne("Bob", "IT", 70000),
            new EmployeeOne("Charlie", "HR", 60000),
            new EmployeeOne("David", "IT", 80000),
            new EmployeeOne("Eve", "Finance", 75000)
        );

        // 1. Group by department
        Map<String, List<EmployeeOne>> byDept = EmployeeOnes.stream()
            .collect(Collectors.groupingBy(EmployeeOne::getDepartment));
        System.out.println("EmployeeOnes grouped by department:");
        System.out.println(byDept);
       // byDept.forEach((dept, empList) -> System.out.println(dept + ": " + empList));

        // 2. Count EmployeeOnes per department
        Map<String, Long> empCount = EmployeeOnes.stream()
            .collect(Collectors.groupingBy(EmployeeOne::getDepartment, Collectors.counting()));
        System.out.println("\nEmployeeOne count by department:");
        System.out.println(empCount);

        // 3. Average salary per department
        Map<String, Double> avgSalary = EmployeeOnes.stream()
            .collect(Collectors.groupingBy(EmployeeOne::getDepartment, Collectors.averagingDouble(EmployeeOne::getSalary)));
        System.out.println("\nAverage salary by department:");
        System.out.println(avgSalary);

        // 4. Names of EmployeeOnes per department
        Map<String, List<String>> namesByDept = EmployeeOnes.stream()
            .collect(Collectors.groupingBy(EmployeeOne::getDepartment,
                     Collectors.mapping(EmployeeOne::getName, Collectors.toList())));
        System.out.println("\nEmployeeOne names by department:");
        System.out.println(namesByDept);
    }
}
