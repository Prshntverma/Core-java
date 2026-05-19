package com.rays.stream;

import java.util.Arrays;
import java.util.List;

public class ChatGPTEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

		list.stream()
		    .filter(e -> e % 2 == 0)
		    .forEach(System.out::println);
	}

}
