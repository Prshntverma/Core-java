package co.in.rays.exercise;

import java.util.Scanner;

public class PrimeNum {
	
	public static void main(String[] args) {
		
//		int num = 4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number......!");
		int num=sc.nextInt();
		int count = 0; 
		
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(num + "= is Prime num....");
			}
		else {
			System.out.println(num +"= is not prime number....");
		}
		sc.close();	
	}
	

}
