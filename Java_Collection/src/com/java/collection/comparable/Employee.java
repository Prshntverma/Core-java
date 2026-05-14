package com.java.collection.comparable;

public class Employee implements Comparable<Employee>{

	public int id;
	public String name;
	public int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.id ;
	}
	@Override
	public String toString() {
	
		return "ID: "+ id +"name :"+name+" salary: "+salary;
	}

	
}
