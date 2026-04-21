package co.in.rays.basics;

import java.util.Scanner;

public class IfElse1 {
	
	public static void main(String[] arg) {
		
//		int num = 2;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter number ....");
		int num =sc.nextInt();
		if(num%2==0) {
			System.out.println("It is the Even number .......");
		}
		else {
			System.out.println("Odd number.......");
		}
		sc.close();
	}
	

}
