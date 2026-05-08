package strings;

public class CountNum {

	public static void main(String[] args) {
		
		 String str="aab34bc123456789c34rf";
		    int count = 0;
		    for(int i = 0;i<str.length();i++) {
		    	char ch =str.charAt(i);
		    	if( ch >='0' && ch <='9') {
		    		count++;
		    	}
		    }
		    
	   System.out.println("Printing string numbers : "+count);
	}
}
