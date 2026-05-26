package com.rays.thread;

public class TestHelloThread {

	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("kutta");
		HelloThread t2 = new HelloThread("kamina");
		
		// thread start when call start() method(start method call run method)
			t1.start();
			t2.start();
			
			System.out.println("the main thread runs......");
			
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(i + " = " + "Akbar");
	}
}
