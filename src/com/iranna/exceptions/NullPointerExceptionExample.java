package com.iranna.exceptions;


public class NullPointerExceptionExample {  
    public static void main(String[] args) {  
        String str = null; // Initializing a String variable to null 
        int a=8;
        int b;
       
        try {  
            int length = str.length(); // Attempting to call a method on a null reference  
            System.out.println("Length of the string: " + length);  
        }
        catch (NullPointerException e) {  
            System.out.println("Error: Null reference encountered.");  
            // Additional error handling code can be added here  
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred.");
           } 
        System.out.println("Rest of the code");
    }  
}  