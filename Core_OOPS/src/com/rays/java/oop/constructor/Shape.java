package com.rays.java.oop.constructor;

public class Shape {

	public String color;
	public int borderWidth;

	public Shape(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

}