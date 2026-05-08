package com.rays.exception.custom;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void withdraw(int amt) {
		if (amt>this.balance) {
			throw new  InSufficientFundException();	
		}else {
			this.balance = this.balance - amt;
		}
	}
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(1000);
		System.out.println("the balance : "+a.getBalance());
		
		a.withdraw(200);
		System.out.println("new Balance : "+a.getBalance());
	}
}
