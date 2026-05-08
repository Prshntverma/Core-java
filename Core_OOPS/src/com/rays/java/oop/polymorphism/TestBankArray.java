package com.rays.java.oop.polymorphism;

public class TestBankArray {

	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		
		banks[0]  = new AxisBank();
		banks[1]  = new HDFC();
		banks[2]  = new Canara();
		
		for(int i = 0;i<banks.length;i++) {
			 System.out.println(banks[i].getName());
			 System.out.println(banks[i].interestRate());
			 System.out.println("........................");
			
		}
		
		
	}
}
