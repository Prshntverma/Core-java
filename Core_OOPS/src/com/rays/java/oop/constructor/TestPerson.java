package com.rays.java.oop.constructor;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person("Prashant ", 25, "Gwalior");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());

	}
}
