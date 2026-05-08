package co.in.rays.exercise;

public class BubbleSort1 {
	public static void main(String[] args) { // arrange the data ascending order  

		int bub[] = {1,4,3,6,7,2};
		int temp=0;
		
		for(int i=0;i<bub.length;i++) {
			for(int j=i+1;j<bub.length;j++)
			{
			   if(bub[i]>bub[j])
			   {
				 temp =bub[i];     // if comment this  then what happened 1 2 0 0 0 0
				  bub[i]=bub[j]; // if i comment this then what happened 1 4 4 6 7 7 
				  bub[j]=temp;   // same what happenend 1 2 2 2 2 2 
			   }
			}
			System.out.print(bub[i]+" ");
		}
		
	}
}
