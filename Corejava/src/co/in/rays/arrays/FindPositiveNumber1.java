package co.in.rays.arrays;

public class FindPositiveNumber1 {
	
	public static void main(String[] args) {
		int arr[] = {1,2,4,4,-6,-6,40,4,30,22};
	    int num = 4;
	    int temp = -1;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				temp = i;
				System.out.println(num + " = "+temp);
			}
			
		}
		System.out.println(temp ==-1 ? temp :" ");
	}

}
