package co.in.rays.exercise;

public class AmstrongsNum {
	
 public static void main(String[] args) {
	 
	  int num = 370;   //153,370 ,371 ,407
	
	     int a = num % 10; // last digit
		int b = (num / 10) % 10; // middle digit
		int c = num / 100;       // first digit
		
		int sum = a*a*a + b*b*b + c*c*c;
	if(num ==sum) {
		System.out.println("Amstrong number : "+ sum);
	}
	else {
		System.out.println("it is not Amstrong number :"+ num);
	}
}
}
