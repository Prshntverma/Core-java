package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(5);
		c.add("Ram");
		c.add('a');
		c.add(true);
		c.add(13.01);
		
		System.out.println("c :"+c );
		System.out.println("size of c :"+ c.size());
		System.out.println(c.contains(4)); // false ----contains check the number of data 
		System.out.println("---------");
		System.out.println(c.remove(5)); //o/p  ram , a, true , 12.01  removing the elememt
		System.out.println(c.contains(5));
		
	}
	
}
