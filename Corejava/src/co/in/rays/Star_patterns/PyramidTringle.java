package co.in.rays.Star_patterns;

public class PyramidTringle {
	
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=1;i<=n;i++)      // it is for rows .......
		{
			for(int j = 1;j<=n-i;j++)    // it is print spaces before printing *
			{
				System.out.print(" ");    // it is spaces before printing
			}
			
			for(int j = 1;j<=2*i-1;j++)  // it is printing star
			{
				System.out.print("*");
			}
			System.out.println();   // it is for new line 
			} 
	}

}
