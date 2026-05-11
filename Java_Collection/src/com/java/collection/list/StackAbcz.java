package com.java.collection.list;

import java.util.Stack;

public class StackAbcz {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char a = 'A'; a <= 'Z'; a++) {
			s.push(a);
		}

		System.out.println("First Stack :" + s);

		Stack s1 = new Stack();

		while (!s.empty()) {

			s1.push(s.pop());
		}

		System.out.println("Second Stack :q" + s1);
	}
}