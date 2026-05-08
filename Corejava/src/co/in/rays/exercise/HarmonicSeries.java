package co.in.rays.exercise;

public class HarmonicSeries {  //1+1/2 + 1/3+ ...1/10 = sum 

	public static void main(String[] args) {
		
		 double sum = 0.0;
		for(int i=1;i<=10;i++) {
		  System.out.println("1/"+i+" = "+(0.1/i) );
		   sum= sum+(1.0/i);
		}
		System.out.println("sum of harmonic series : "+sum);
	}
}
