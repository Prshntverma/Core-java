package com.java.collection;
import java.util.ArrayList;
import java.util.Collection;
public class TestRetainAllMethod {
 
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add("banana");
		c1.add("Mango");
		c1.add("Orange");
		
		System.out.println(c1);
		System.out.println("Size of c1 :"+c1.size());
		System.out.println("---------------------------");
		
		Collection c2 = new  ArrayList();
		c2.add("Apple");
		c2.add("grabs");
		c2.add("Mango");
		System.out.println(c2);
		System.out.println("size of c2 :"+c2.size());
		
		System.out.println("------------------------------");
		c1.retainAll(c2);
		System.out.println(c1);
		System.out.println(c2);
		
		
	}
}
