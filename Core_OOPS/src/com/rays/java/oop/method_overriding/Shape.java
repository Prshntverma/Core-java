package com.rays.java.oop.method_overriding;

public class Shape {

	  protected String color;
	 protected int borderwidth;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	 public double area() {
		 return 0.0;
	 }
}
