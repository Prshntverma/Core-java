package com.java.collection.sorting;

public class Student {
	public int roll;
	public String name;
	public int standard;
	
	public Student(int roll,String name, int standard) {
		 this.roll = roll;
		 this.name = name;
		 this.standard = standard;
	}
	
	@Override
	public String toString() {
		
		return "roll no :"+roll+" name : "+name+" class : "+standard;
	}

}

