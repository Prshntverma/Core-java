package co.in.rays.exercise;

import java.util.Scanner;

public class UserInputAmstrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check Amstrong  num : ");
		int num =sc.nextInt();
		
		int a = num % 10; // last digits
		int b = (num/10)% 10; //MIDDLE DIIGITS
		int c = num /100; // first digit
		
		int sum = a*a*a + b*b*b+ c*c*c;
		 if(num==sum) {
			 System.out.print("it is Amstrong num: "+ sum);
		 }
		 else {
			 System.out.println("it is not Amstrong num :"+ num);
		 }
		 sc.close();
	}
	

}
