package com.iranna.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {
public static void main(String[] args) {
	

	List<String> names = Arrays.asList("Robert","Nick","William");
	Stream<String> s1 = names.stream();
	//creating streams in different ways
	String[] cities = {"London","Delhi","Mumbai"};
	Stream<String> s2 = Arrays.stream(cities);
	
	Stream<Integer> s3 =Stream.of(1,2,3,4);
	Stream<Integer> s4= Stream.generate(()->(int)Math.random()*100).limit(100);
	Stream<Integer> s5= Stream.iterate(0, n->n+1).limit(100);
	//System.out.println(s1);
}
}
