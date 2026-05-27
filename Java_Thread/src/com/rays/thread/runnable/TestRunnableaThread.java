package com.rays.thread.runnable;

public class TestRunnableaThread {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadRunnable("Ram"));
		Thread t2 = new Thread(new ThreadRunnable("Shyam"));
		
		
		t1.start();
		t2.start();
		
		
		
	}

}
