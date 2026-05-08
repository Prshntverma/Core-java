package com.rays.java.oop.polymorphism;

public class AxisBank extends Bank{

	@Override
	public String getName() {
		
		return "AxisBank";
	}
	@Override
	public double interestRate() {
		
		return 14.0;
	}
}
