package com.iranna.java8feature;
import java.util.*;
import java.util.stream.*;

 class Minister {
    private String name;
    private int age;
    private int yearsInOffice;

    public Minister(String name, int age, int yearsInOffice) {
        this.name = name;
        this.age = age;
        this.yearsInOffice = yearsInOffice;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearsInOffice() {
        return yearsInOffice;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Years in Office: " + yearsInOffice + ")";
    }
}



public class IntSummaryStatisticsExample {
    public static void main(String[] args) {
        List<Minister> ministers = Arrays.asList(
            new Minister("John Doe", 55, 10),
            new Minister("Jane Smith", 47, 5),
            new Minister("Robert Green", 62, 15),
            new Minister("Emily White", 38, 3),
            new Minister("Michael Brown", 50, 8)
        );

        // Summary for ages
        IntSummaryStatistics ageStats = ministers.stream()
            .mapToInt(Minister::getAge)
            .summaryStatistics();
        // similarly there are methods: mapToLong(),mapToDouble().
        System.out.println("📊 Age Statistics:");
        System.out.println("Count: " + ageStats.getCount());
        System.out.println("Sum: " + ageStats.getSum());
        System.out.println("Min: " + ageStats.getMin());
        System.out.println("Max: " + ageStats.getMax());
        System.out.println("Average: " + ageStats.getAverage());

        // Summary for years in office
        IntSummaryStatistics yearsStats = ministers.stream()
            .mapToInt(Minister::getYearsInOffice)
            .summaryStatistics();

        System.out.println("\n📊 Years in Office Statistics:");
        System.out.println("Total Years: " + yearsStats.getSum());
        System.out.println("Average Years: " + yearsStats.getAverage());
    }
}
