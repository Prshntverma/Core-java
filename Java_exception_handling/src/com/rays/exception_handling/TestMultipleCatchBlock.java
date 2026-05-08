package com.rays.exception_handling;

public class TestMultipleCatchBlock {
	
	public static void main(String[] args) {
		String str = "Prashant"; // null
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(10));		
		}catch(NullPointerException e) {
			System.out.println("exception 1 : "+e.getMessage());
		}catch(IndexOutOfBoundsException e) {
			System.out.println("exception 2 : "+e.getMessage());
		}
		finally {
			System.out.println("always runnn and execute...!");
		}
	}

}
