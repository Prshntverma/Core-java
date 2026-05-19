package com.rays.stream;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Prashant";

		String reverse = new StringBuilder(str).reverse().toString();

		System.out.println("Present String : "+str+"|| after reverse :"+reverse);
	}
}