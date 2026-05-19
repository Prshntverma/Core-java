package com.java.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
 public static void main(String[] args) {
	
	 Employee e1 = new Employee(1, "Prashant", 78000);
	 Employee e2 = new Employee(2, "Anniee", 3400);
	 Employee e3 = new Employee(3, "sakkkk", 7000);
	 Employee e4 = new Employee(4, "VIraaattt", 2000);
	 Employee e5 = new Employee(5, "Prashant", 8000);
	  
	 List<Employee> list =  new ArrayList<Employee>();
	 list.add(e3);
	 list.add(e1);
	 list.add(e5);
	 list.add(e2);
	 list.add(e4);
	 for(Object o :list) {
		 System.out.println(o);
	 }
	 System.out.println("---------------");
	 Collections.sort(list);
	 for(Object o : list) {
		 System.out.println(o);
	 }

}
}
