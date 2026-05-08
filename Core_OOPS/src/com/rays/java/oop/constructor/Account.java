package com.rays.java.oop.constructor;

public class Account {

	private String accNo;
	private String accType;
	private double bal;

	public Account() {
		System.out.println("this is Default Constructor");
	}

	public Account(String accNo, String accType, double bal) {
		this.accNo = accNo;
		this.accType = accType;
		this.bal = bal;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public double getBal() {
		return bal;
	}
}
