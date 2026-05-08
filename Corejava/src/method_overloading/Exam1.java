package method_overloading;

public class Exam1 {

	
	public static void add() {
	  System.out.println("hello.......!");
	  
	}
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int a,int b,int c, int d) {
		return a+b+c+d;
	}
	
	
	public static void main(String[] args) {
		add();
		System.out.println(add(25,53));
		System.out.println(add(34,43,43));
		System.out.println(add(12,23,34,45));
	}
}
