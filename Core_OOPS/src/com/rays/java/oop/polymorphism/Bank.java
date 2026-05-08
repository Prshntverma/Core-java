package com.rays.java.oop.polymorphism;

public class Bank {

	public String getName() {
		return "RBIBank";
	}
	
	public double interestRate() {
		return 11.0;
	}
	
	public static Bank getBank(int i) {
        if (i == 1) {
            return new HDFC();
        } else if (i == 2) {
            return new Canara();
        } else {
            return new Bank();
        }

	}
	
}
