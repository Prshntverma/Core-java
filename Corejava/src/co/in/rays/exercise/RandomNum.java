package co.in.rays.exercise;

import java.util.Random;

public class RandomNum {

	  public static void main(String[] args) {
		  
		  Random rn = new Random();
		   
		  for(int i=1; i<=5;i++) {
			  
			  int num = rn.nextInt(100);
			  System.out.print(num + " ");
			  
			  
		  }
	  }
}
