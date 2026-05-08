package co.in.rays.arrays;

public class ArrayFirstHighestNum {
   
  public static void main(String[] args) {
	
	   int arr[] = {12,10,13,12,1,15,27};
	    
	   int high = arr[0];
	   int h2 =  arr[0];
	   for(int i=0;i<arr.length;i++) {
		   
		   if(arr[i]>high) {
			  // arr[i]== high;
			   high = arr[i];	   
		   }
		      
	   }System.out.println("highest num :"+high);
	   
	   for(int i =0;i<arr.length;i++)  // 2nd highest number :
	   {
		  if( arr[i]>h2 && arr[i]<high) {
			  h2 = arr[i];
		  }
		 
	   } System.out.println("2nd Highest num :"+h2);
	   
}
}
