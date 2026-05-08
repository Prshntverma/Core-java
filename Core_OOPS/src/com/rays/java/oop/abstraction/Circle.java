package com.rays.java.oop.abstraction;

public class Circle extends Shape{

	private int radi;
	
	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) {
		this.radi = radi;
	}

	@Override
	public double area() {
		
		return Math.PI* radi * radi;
	}
 
	
}
