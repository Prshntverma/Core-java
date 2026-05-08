package com.rays.java.oop.inheritence;

public class TestShape {

	public static void main(String[] args) {
		System.out.println("..........circle........");
		
		Circle c = new Circle();
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(3);
		
		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
		
		System.out.println("..........triangle........");
		Rectangle r = new Rectangle();
		r.setColor("yellow");
		r.setBorderWidth(4);
		r.setLength(4);
		r.setWidth(10);
		
		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		System.out.println("..........rectangle........");
		
		Triangle t = new Triangle();
		t.setColor("black");
		t.setBorderWidth(3);
		t.setBase(2);
		t.setHeight(5);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderWidth());
		System.out.println(t.getHeight());
		System.out.println(t.getBase());
	}
}
