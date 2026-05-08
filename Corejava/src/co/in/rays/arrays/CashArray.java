package co.in.rays.arrays;

import java.util.Scanner;

public class CashArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Money for counting notes :");
		
	     int money=sc.nextInt();
		 int []notes = {1000,500,200,100,50,20,10,5,2,1};
		 
      for(int note: notes) {
    	  int count = money/note;
     System.out.println("total number of notes :"+note +"="+count);
        money = money % note;
      }
      sc.close();
	}

}
