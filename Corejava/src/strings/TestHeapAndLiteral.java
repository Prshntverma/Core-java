package strings;

public class TestHeapAndLiteral {
	public static void main(String[] args) {
		 String a = "Prashant Verma";
		 String b1 = "Prashant Verma";
		 
		 String c = new String("Prashant Verma");
		 String d = new String("Prashant Verma");
		 
		 System.out.println(a==b1);
		 System.out.println(c==d);
		 System.out.println(a.equals(b1));
	}
	

}
