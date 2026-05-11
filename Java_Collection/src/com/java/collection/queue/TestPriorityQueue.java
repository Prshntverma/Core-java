package com.java.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;
    // priority queen main ek  hi type ka data jata hai or sequence follow krte hai 
 // riorityQueue internally elements ko compare karta hai taaki priority/order maintain ho sake.
public class TestPriorityQueue {
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.add(24);
		q.add("krishn");
		System.out.println(q);

}
}