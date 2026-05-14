package com.java.collection.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestMarksheet {
public static void main(String[] args) {
	
	Marksheet m1 = new Marksheet(100, "Prashant ", 89);
	Marksheet m2 = new Marksheet(101, "shant ", 56);
	Marksheet m3 = new Marksheet(102, "Prsnt ", 72);
	Marksheet m4 = new Marksheet(103, "Prt ", 33);

	 List<Marksheet>list = new ArrayList<Marksheet>();
	 list.add(m4);
	 list.add(m1); 
	 list.add(m2); 
	 list.add(m3);
	 
	 for( Object o :list)
	 {
		 System.out.println(o);
	 }
	 System.out.println("----------------------");
	 Collections.sort(list);
	 for(Object o:list) {
		 System.out.println(o);
	 }
}
}
