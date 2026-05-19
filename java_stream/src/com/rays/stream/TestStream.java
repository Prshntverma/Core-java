package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;

public class TestStream {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Prashant");
		list.add("anshul");
		list.add("Kanak");
		list.add("Uday");
		list.add("anshul");
		list.add("Prashant");
		list.add("Verma");
		list.add("Kanak");
		list.add("Prashant");
		
//		list.forEach(System.out::println);
		list.forEach(e -> System.out.println(e));
		
		System.out.println("-----------sortedd------------------");
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("-------------Reverse order------------------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("...............distinct....................");
		//list.stream().sorted().distinct().map().forEach(System.out::println);
		list.stream()
	    .sorted()
	    .distinct()
	    .forEach(System.out::println);
		
		System.out.println(".........................................");
		list.stream()
		.distinct()
		.map(e -> e.toLowerCase())
		.filter(e -> e.startsWith("a"))
		.forEach(System.out::println);
	}

}
