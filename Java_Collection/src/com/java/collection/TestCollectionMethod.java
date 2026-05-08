package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add("banana");
		c1.add("Mango");
		c1.add("Mango");
		c1.add("Orange");
		
		System.out.println(c1);
		System.out.println("Size of c1 :"+c1.size());
		System.out.println("---------------------------");
		
		Collection c2 = new  ArrayList();
		c2.add("Apple");
		c2.add("grabs");
		System.out.println(c2);
		System.out.println("size of c2 :"+c2.size());
		
		System.out.println("------------------------------");
		System.out.println(c1.contains(c2));
		c1.addAll(c2);
		System.out.println(c1);
		System.out.println("after the add c1 size :"+c1.size());
		
		
		System.out.println(c1.containsAll(c2));
		System.out.println(c1.removeAll(c2));
		System.out.println(c1.size());
		
		System.out.println("--------------------------------");
		
		System.out.println(c2.isEmpty());
		
		c2.clear();
		System.out.println(c2.isEmpty());
		
		
		
	}

}
