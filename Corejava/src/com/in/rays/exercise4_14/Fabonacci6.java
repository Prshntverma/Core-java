package com.in.rays.exercise4_14;
public class Fabonacci6 {

	public static void main(String[] args) {
		//0 0 1 1 2 3 5 8 13
		
		int a =0;
		int b =1 ;
		int c;
		System.out.println(" fabonacci series :" );
		for(int i = 1; i<12;i++) {
		  c = a + b;
		  System.out.print(a+ " ");
		  a = b;
		  b = c;
		  
		}
	}
}