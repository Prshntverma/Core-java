package strings;

public class SearchingNum {

	 public static void main(String[] args) {
		
	    String str="aab34bc123456789c34rf";
       String num = "";
	 
	    for(int i = 0;i<str.length();i++) {
	    	char ch =str.charAt(i);
	    	if( ch >='0' && ch <='9') {
	    	 num = num + ch;
	    	}

	    }
	    
   System.out.println("Printing string numbers : "+num);
	 
	}
}
