package com.iranna.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayListDemo {
    public static void main(String[] args) {
		
	
	List<String> list = new ArrayList<>();
	 list.add("New York");
	 list.add("Miami");
	 list.add("Texas");
	 for(String l:list) {
		 System.out.println(l);
	 }
	 
	//creating arraylist another way 
	List<String> list2= Arrays.asList("Monday","Tuesday");
	//cant add elem to this arraylist, can only replace
	//list2.add("Saturday");
	list2.set(1, "Sunday");
	System.out.println("Sunday "+list2.get(1));
	for(String l:list2) {
		 System.out.println(l);
	 }
	
	Integer[] array = {11,12,13,14,13,15};
	List<Integer> list3 = Arrays.asList(array);
	//list3.remove(1);
	//System.out.println(list3);
	List<Integer> list4 =new ArrayList<>(list3);
	System.out.println(list4);
	
	System.out.println("contains "+list4.contains(12));
	System.out.println("get "+ list4.get(2));
	System.out.println("indexOf "+list4.indexOf(13));
	System.out.println("lastIndexOf "+list4.lastIndexOf(13));
	System.out.println("size "+list4.size());
	
	
	
    }
}
