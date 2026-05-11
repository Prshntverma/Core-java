package com.java.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

// fifo
public class TestArrayDeQueue {
	public static void main(String[] args) {

		Queue q = new ArrayDeque();
		for (char c = 'a'; c <= 'p'; c++) {
			q.offer(c);
		}
		System.out.println(" q :" + q);

		System.out.println("this is first element: " + q.peek()); // peek method search krta hai
		System.out.println("q: " + q);

		System.out.println("first element to be remove: " + q.poll()); // poll method remove krta hai
		System.out.println("q: " + q);

		System.out.println("first element to be remove: " + q.poll()); // poll method remove krta hai
		System.out.println("q: " + q);

	}
}
