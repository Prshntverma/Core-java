package com.rays.exception_handling;

public class TestParentCatchBlock {

	public static void main(String[] args) {
		String str = "Rays";
		try {
			System.out.println("length of string : "+str.length());
			System.out.println(str.charAt(5));
		}catch(Exception e){
			System.out.println("exception occur :"+e.getMessage());
		}finally {
			System.out.println("always execute");
		}
	}
}
