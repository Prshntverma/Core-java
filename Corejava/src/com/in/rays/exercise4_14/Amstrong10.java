package com.in.rays.exercise4_14;

public class Amstrong10 {
	
	public static void main(String[] args) {
		int num  = 153;
		 
		 int a = num%10;
		 int b = (num/10) % 10;
		 int c =  num/100;	
		 
		 int sum = a*a*a + b*b*b + c*c*c;
		 if(num==sum) {
			 System.out.println("Amstrong num : " +num);
		 }
		 else {
			 System.out.println("not Amstrong num : "+ num);
		 }
	}
	
}
