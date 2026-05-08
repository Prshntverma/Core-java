package com.rays.java.oop.encapsulation;

public class Account {
	private String accNumber;
	private String accType;
	private double balance;
	
	public String getAccNumber() {
     return this.accNumber;
}
 public void setAccNumber(String accNumber) {
	this.accNumber = accNumber; 
 }
 
 public String getAccType() {
	 return this.accType;
 }
 public void setAccType(String accType) {
	 this.accType = accType;
 }
 public double getBalance() {
	 return this.balance;
 }
 
 public void setBalance(double balance) {
	 this.balance=balance;
 }
 public void deposit(double amount) {
	 balance = balance + amount;
	 System.out.println("total balance after deposit :"+balance);
 }
 public void withdrawal(double amount) {
	 if(amount>balance) {
		 System.out.println("insufficient  balance in your Account :");
	 }else {
		 balance = balance-amount;
		 System.out.println("total balance after withdrawal :"+balance);
	 }
 }
 
}
 
 
