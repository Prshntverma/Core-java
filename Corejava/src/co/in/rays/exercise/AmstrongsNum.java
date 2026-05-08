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
/*
package com.rays.basic.exercise;

public class ArmstrongNo {

	// anshul
	public static void main(String[] args) {

		int num = 153;
		int temp = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {
			r = num2 % 10;
			temp = temp + r * r * r;
			num2 = num2 / 10;
		}

		if (temp == num) {
			System.out.println("Armstrong No");
		} else {
			System.out.println("Not Armstrong No");
		}

	}

}*/
