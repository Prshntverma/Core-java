package co.in.rays.basics;

import java.util.Scanner;

public class ScannerSwitch1 {
	
	public static void main(String[] args ) {
		
//		String op = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("||....CALCULATE THE VALUE......||");
		System.out.println("||  + , - , * , / , %   ||"); 
		String op = sc.nextLine();
		System.out.println("ENTER  a value ?"); 
		int a = sc.nextInt(); 
		System.out.println("ENTER  b value ?"); 
		int b = sc.nextInt(); 
		
		
		switch(op) {
		case "+":
			  System.out.println("Addition of.... "+ (a +b));
			  break;
		case "-":
			System.out.println(" Substraction of.... "+ (a -b));
			break;
		case "*":
			System.out.println("multiple  of.... "+ (a * b));
			break;
		case "/":
			System.out.println("Division of.... "+ (a /b));
			break;
		case "%":
			System.out.println("Percentage  of.... "+ (a % b));
			break;
		
		default:System.out.println("Syntax is not Found !!!");
		sc.close();
		}
	
	
		
	
		
		
	}
	

}
