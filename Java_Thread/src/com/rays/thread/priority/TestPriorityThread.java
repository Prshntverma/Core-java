package com.rays.thread.priority;

public class TestPriorityThread {
	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Ram");

		PriorityThread t2 = new PriorityThread("Shyam");

		// Set thread priorities
		t1.setPriority(Thread.MAX_PRIORITY); // Maximum priority
		t2.setPriority(Thread.MIN_PRIORITY); // Minimum priority

		t1.start();

		t2.start();
	}
}
