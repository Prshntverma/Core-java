package com.rays.java.oop.encapsulation;

public class TestAutoMobile {
 
	 public static void main(String[] args) {
		AutoMobile am1 = new AutoMobile();
		am1.setColor("Dark Black ");
		am1.setMake("petrol");
		am1.setSpeed(170);
		
		System.out.println("the color of vichle :"+am1.getColor());
		System.out.println("the make of vichle :"+am1.getMake());
		System.out.println("the color of Speed :"+am1.getSpeed());
	
		
	}
}
