package co.in.rays.arrays;

public class Array3 {
	
	// assigning the value through array indexing......
	 public static void main(String[] args) {
		 int []a ;
		a = new int[10];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("Printing the valuee :"+ a[i]);
//		} 
//		a[0] = 1;
//		a[1] = 2;
//		System.out.println(a[0] +" "+a[1]);
//	}
		for(int i=0;i<a.length;i++) {
			a[i]= i+1;
		}
		for(int i=1;i<a.length;i++) {
			System.out.println("printing value :"+ a[i]);
		}
	 
	 }	

}
