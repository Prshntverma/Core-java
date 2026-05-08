//package co.in.rays.exercise;
//
//public class SumOfnumDivisibleBySeven {
//
//	public static void main(String[] args) {
//		 int sum =0;
//		 for(int i=1;i<50;i++) {
//			 if(i%7==0) {
//				 System.out.print(i);
//				 sum=sum+i;
//			 }
//			 
//		 }
//		 System.out.println(""+sum);
//	}
//}

package co.in.rays.exercise;

public class SumOfnumDivisibleBySeven {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 50; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");  
				//sum = sum + i;
			}
		}

		//System.out.println("\nTotal Sum = " + sum);
	}
}