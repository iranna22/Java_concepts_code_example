package com.iranna.oops;

public class TestMain {

	public static void main(String[] args) {
      Employee e1 = new Employee();
      Employee e2 = new Employee(11,"Steve");
      Employee e3 = new Employee(21,"Robin",15000);
      
      System.out.println(e1);
      System.out.println(e2);
      System.out.println(e3);
      
	}

}
