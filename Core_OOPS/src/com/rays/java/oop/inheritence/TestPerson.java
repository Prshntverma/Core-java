package com.rays.java.oop.inheritence;

import java.time.LocalDate;

public class TestPerson {
	public static void main(String[] args) {
		
		System.out.println(".........Doctor..........");
		
		Doctor d = new Doctor();
		d.setName("Prashant Verma");
		d.setDob(LocalDate.now());
		d.setRegistrationNo("123CD344");
		d.setAddress("Gurgaon");
		
		System.out.println(d.getName());
		System.out.println(d.getAddress());
		System.out.println(d.getDob());
		System.out.println(d.getRegistrationNo());
		
		System.out.println("........Bussinessman.....");
		Businessman b = new Businessman();
		b.setName("Ambaniieeeee");
		b.setDob(LocalDate.now());
		b.setIncome(70000.00);
		b.setAddress("Indore");
		
		
		System.out.println(b.getName());
		System.out.println(b.getDob());
		System.out.println(b.getAddress());
		System.out.println(b.getIncome());
		
		System.out.println(".........Student.........");
		
	    Student s = new Student();
	    
	     s.setName("Krishnaa...");
	     s.setRollNo("21");
	     s.setDob(LocalDate.now());
	     s.setAddress("Mathura");
	     s.setMarks(99);
	     
	     System.out.println(s.getName());
	     System.out.println(s.getRollNo());
	     System.out.println(s.getDob());
	     System.out.println(s.getAddress());
	     System.out.println(s.getMarks());
	     
	}

}
