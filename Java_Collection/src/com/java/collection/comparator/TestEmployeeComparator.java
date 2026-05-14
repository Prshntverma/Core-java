package com.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Prashant", 75000);
		Employee e2 = new Employee(2, "Ram", 78000);
		Employee e3 = new Employee(3, "Shyam", 65000);
		Employee e4 = new Employee(4, "abc", 45000);
		Employee e5 = new Employee(5, "K....", 89000);
		Employee e6 = new Employee(6, "t......", 74000);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e6);
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e5);
		list.forEach(System.out::println);
		System.out.println("------------sort by id--------------");
		OrderById ById = new OrderById();
		
		Collections.sort(list, ById);
		list.forEach(System.out::println);
		
		System.out.println("--------------sort by name-----------------");
		OrderByName byName = new OrderByName(); 
		Collections.sort(list, byName);
		list.forEach(System.out::println);
		
		System.out.println("--------------sort by salary-----------------");
		OrderBySalary sal = new OrderBySalary(); 
		Collections.sort(list,sal);
		list.forEach(System.out::println);
		
	}
}
