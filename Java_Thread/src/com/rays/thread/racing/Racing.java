package com.rays.thread.racing;

public class Racing extends Thread {
	String name = null;
	
	public static Account acc = new Account();
	 
	public Racing(String name) {
		this.name = name; 	
	}
	
	@Override
	public void run() {
		
		for(int i= 1 ; i<6;i++) {
			acc.deposit(name, 1000);
		}
	
	}

}
