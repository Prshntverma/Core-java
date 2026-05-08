package com.rays.java.oop.constructor;

public class TestCircle {
	public static void main(String[] args) {

		Circle c = new Circle("black", 3, 180);

		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.getClass());

	}
}
