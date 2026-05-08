package com.java.collection.list;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("ram");
		v.addElement("shym");
		v.add("wer");
		v.add(3,"ert");
		
		System.out.println(v.get(2));
		
		
	}
}
