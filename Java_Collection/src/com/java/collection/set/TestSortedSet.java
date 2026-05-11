package com.java.collection.set;
import java.util.SortedSet;
import java.util.TreeSet;
public class TestSortedSet {
	// SortedSet is order set in asc
	// does not contain null value
	// does not contain duplicate value

	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		s.add('c');
		s.add('b');
		s.add('a');
//        s.add(12);
//        s.add(1);
//        s.add(23);
		System.out.println(s);
		
		
		
	}
}
