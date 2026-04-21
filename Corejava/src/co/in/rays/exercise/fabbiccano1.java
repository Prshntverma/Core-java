package co.in.rays.exercise;

public class fabbiccano1 {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("fabbicano  start....");
		for(int i =1;i<11;i++) {
			
		   c = a+b;
		   System.out.print(a + " ");
		
		a = b;
		b = c;
		}
		
	}

}
