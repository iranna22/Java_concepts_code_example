package com.iranna.collections;


import java.util.*;

//POJO class
class Student implements Comparable<Student> {
 private String name;
 private int marks;

 // Constructor
 public Student(String name, int marks) {
     this.name = name;
     this.marks = marks;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getMarks() {
     return marks;
 }

 // toString for easy printing
 @Override
 public String toString() {
     return "Student{name='" + name + "', marks=" + marks + '}';
 }

 // Comparable: Natural order sorting by name
// @Override
// public int compareTo(Student other) {
//     return this.name.compareTo(other.name);
// }
 // we can override compareTo once, so can sort by any one parameter.
 @Override
 public int compareTo(Student other) {
     return Integer.compare(this.marks, other.marks);
 }

}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// Comparator implementation class for sorting by marks
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getMarks(), s2.getMarks());
    }
}
public class StudentSortingExample {

 public static void main(String[] args) {
     // Create a list of students
     List<Student> students = new ArrayList<>();
     students.add(new Student("Alice", 85));
     students.add(new Student("Bob", 75));
     students.add(new Student("Charlie", 90));
     students.add(new Student("David", 70));
     students.add(new Student("Eve", 85));

     // Without Java 8 features
     System.out.println("Without Java 8 features:");

     // Sorting by name (natural order using Comparable)
     Collections.sort(students);
     System.out.println("Sorted by name (natural order): " + students);

     // Sorting by marks using Comparator
     Collections.sort(students, new Comparator<Student>() {
         @Override
         public int compare(Student s1, Student s2) {
             return Integer.compare(s1.getMarks(), s2.getMarks());
         }
     });
     System.out.println("Sorted by marks (natural order): " + students);

     // Sorting by name in descending order
     Collections.sort(students, new Comparator<Student>() {
         @Override
         public int compare(Student s1, Student s2) {
             return s2.getName().compareTo(s1.getName());
         }
     });
     System.out.println("Sorted by name (descending order): " + students);

     // Sorting by marks in descending order
     Collections.sort(students, new Comparator<Student>() {
         @Override
         public int compare(Student s1, Student s2) {
             return Integer.compare(s2.getMarks(), s1.getMarks());
         }
     });
     System.out.println("Sorted by marks (descending order): " + students);
     
     System.out.println("With Comparator Implementation Classes:");

     // Sorting by name using NameComparator
     Collections.sort(students, new NameComparator());
     System.out.println("Sorted by name (natural order): " + students);

     // Sorting by marks using MarksComparator
     Collections.sort(students, new MarksComparator());
     System.out.println("Sorted by marks (natural order): " + students);

     // Sorting by name in descending order using NameComparator
     Collections.sort(students, Collections.reverseOrder(new NameComparator()));
     System.out.println("Sorted by name (descending order): " + students);

     // Sorting by marks in descending order using MarksComparator
     Collections.sort(students, Collections.reverseOrder(new MarksComparator()));
     System.out.println("Sorted by marks (descending order): " + students);
 


     // With Java 8 features
    
     System.out.println("\nWith Java 8 features using Lambda Expressions:====");

  // Sorting by name (natural order)
  students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
  System.out.println("Sorted by name (natural order): " + students);

  // Sorting by marks (natural order)
  students.sort((s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks()));
  System.out.println("Sorted by marks (natural order): " + students);

  // Sorting by name in descending order
  students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
  System.out.println("Sorted by name (descending order): " + students);

  // Sorting by marks in descending order
  students.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));
  System.out.println("Sorted by marks (descending order): " + students);

  System.out.println("\nWith Java 8 features using Method reference:===");

     // Sorting by name (natural order)
     students.sort(Comparator.comparing(Student::getName));
     System.out.println("Sorted by name (natural order): " + students);

     // Sorting by marks (natural order)
     students.sort(Comparator.comparingInt(Student::getMarks));
     System.out.println("Sorted by marks (natural order): " + students);

     // Sorting by name in descending order
     students.sort(Comparator.comparing(Student::getName).reversed());
     System.out.println("Sorted by name (descending order): " + students);

     // Sorting by marks in descending order
     students.sort(Comparator.comparingInt(Student::getMarks).reversed());
     System.out.println("Sorted by marks (descending order): " + students);
 }
}

