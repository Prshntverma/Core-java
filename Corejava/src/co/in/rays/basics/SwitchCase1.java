package co.in.rays.basics;

public class SwitchCase1 {
	
	public static void main(String[] args) {

	 String op = "+";
	  int a = 5;
	  int b = 6;
	 
	  switch(op){
		  
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
	  }
}
}
