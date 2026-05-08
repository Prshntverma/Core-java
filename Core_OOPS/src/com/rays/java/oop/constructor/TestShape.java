package com.rays.java.oop.constructor;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape("White", 3);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}
}
