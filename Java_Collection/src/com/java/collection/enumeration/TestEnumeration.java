package com.java.collection.enumeration;
import java.util.Enumeration;
import java.util.Vector;
public class TestEnumeration {
	public static void main(String[] args) {
		
Vector v = new Vector();
		
		v.addElement("ram");
		v.addElement("shym");
		v.add("wer");
		v.add(3,"ert");
		
		System.out.println("-------------------");
		Enumeration e = v.elements();
		 v.add("prshnt");// no exception == fail safe
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
		}
		System.out.println("v :"+v);
	}

}
