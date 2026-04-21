package co.in.rays.basics;

import java.util.Scanner;

public class UserWeekDays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day for searching.....");
		String s = sc.nextLine();
      switch(s) {
	
		case "mon": System.out.println("this is monday");
		break;
		case "tues": System.out.println("this is tuesday");
		break;
		case "wed": System.out.println("this is wednesday");
		break;
		case "thus": System.out.println("this is thursday");
		break;
		case "fri": System.out.println("this is Friday ");
		break;
		case "sat": System.out.println("this is Saturnday ");
		break;
		
		default : System.out.println("sunday............");
		}
	}

}
