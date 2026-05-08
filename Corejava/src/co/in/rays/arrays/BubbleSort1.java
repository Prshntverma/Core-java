package co.in.rays.arrays;

public class BubbleSort1 {
	public static void main(String[] args) { // arrange the data ascending order  

		int bub[] = {10,40,30,60,70,34};
		int temp=0;
		
		for(int i=0;i<bub.length;i++) {
			for(int j=i+1;j<bub.length;j++)
			{
			   if(bub[i]>bub[j])
			   {
				  temp =bub[i];
				  bub[i]=bub[j];
				  bub[j]=temp;   
			   }
			}
			System.out.print(bub[i]+" ");
		}
		
	}
}
