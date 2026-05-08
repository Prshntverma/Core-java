package strings;

public class SamePlaceReverse {

	public static void main(String[] args) {
		String str = "Prashant verma";
		String word ="";
		//System.out.println("Present First String  before space");
		//char ch = str.charAt(i);
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
		
			if(ch==' ') {
				System.out.print(word + " ");
				word ="";
			}
			else {
				word=ch + word;
			}
			
		}
		System.out.print(word);
	}
	
}
