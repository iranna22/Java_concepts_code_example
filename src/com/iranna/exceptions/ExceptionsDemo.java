package com.iranna.exceptions;


public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
       }
            catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array Index Out of Bounds Exception occurred.");
        } 
            catch (Exception e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}
