package com.rays.exception_handling;

public class TestArithmeticTrycatch {

	public static void main(String[] args) {
		
		int i = 13;
		int k  = 0;
		 try {
			 System.out.println("try block...running...");
			 int div = i/k;
			 System.out.println("div : "+div);
			 
		 }
		 catch(ArithmeticException e){
			 System.out.println("exception : "+e.getMessage());
			 
		 }
		 System.out.println("it wAS THE LAST PRINT OUT......");
		
	}

}
