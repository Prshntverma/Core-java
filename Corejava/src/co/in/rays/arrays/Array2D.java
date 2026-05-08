package co.in.rays.arrays;

public class Array2D {
	
	public static void main(String[] args) {
		int a[][] = new int[9][10]; 

		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++) {
				a[i][j]= (i+1) * (j+1);
				
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
			
		}
	}
}
