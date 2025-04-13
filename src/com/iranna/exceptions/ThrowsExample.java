package com.iranna.exceptions;

import java.io.*;

public class ThrowsExample {
	public static void readFile() throws IOException {
		FileReader file = new FileReader("nonexistentfile.txt");
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("File not found! Exception: " + e);
		}
	}
}