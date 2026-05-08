package co.in.rays.arrays;

public class MoneyTry {
	public static void main(String[] args) {
		
		int money = 6976;
		int notes[]= {1000,500,100,50,10,5};
		
        for(int note:notes) {
        	int count = money/note;
        	System.out.println("the total notes : "+note+"="+count);
        	money =money%note;
        }                                                               
		
	}

}
