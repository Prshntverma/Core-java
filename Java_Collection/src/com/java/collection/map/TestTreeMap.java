package com.java.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		
		SortedMap m = new TreeMap();  //sorted map in asc order ...........
		
		m.put(4, "1234");
		m.put(1, "1");	
		m.put(2, "12");
		m.put(5, "12345");
		m.put(2, "12");
		m.put(5, "12345");
		m.put(3, "123");
		m.put(6, "123456");
		
		
		System.out.println(m.entrySet()); // print key and value both.....
		System.out.println(m.containsKey(4)); //check the keys is present
		System.out.println(m.containsValue(3));// check the value is present///
		System.out.println(m.keySet());
		System.out.println(m.values());
	}
}
