package com.rays.thread.join;

public class TestJoinThread {

	public static void main(String[] args) {
		JoinThread t1 = new JoinThread("bhai hai tuu");
		JoinThread t2 = new JoinThread("bhai Nahi hai tuu......");
		
	
		
		t1.start();// Start t1 first
		try {
			t2.join();// Other thread including main thread Wait for t1 to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start(); // Start t2 after t1 completes
		
		 for(int i=1;i<5;i++) {
			 System.out.println("main thread is running........");
		 }
		
		
		
	}
}