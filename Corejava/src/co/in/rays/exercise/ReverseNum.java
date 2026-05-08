package co.in.rays.exercise;

public class ReverseNum {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println(1 + "/" + i);
//		}
		  int num = 1234;
	        int rev = 0;

	        while (num > 0) {
	            int digit = num % 10;   // get last digit
	            rev = rev * 10 + digit; // build reverse number
	            num = num / 10;         // remove last digit
	        }

	        System.out.println("Reverse Number = " + rev);
//		int num =1234;
//		int rev = 0;
//		while(num>0) 
//		{
//			int a = num % 10; // last digit
//			int b = (num / 10) % 10; // middle digit
//			int c = num / 100;       // first digit
//		
//		}
//		
		
		
		
		

	}
}
