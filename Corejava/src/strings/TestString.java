package strings;

public class TestString {

	 public static void main(String[] args) {
		
		 String name = "Prashant Verma";// instance method
		
		 System.out.println("name ="+name);
		 System.out.println("length of name = "+name.length());
		 System.out.println("7th Char is :  "+name.charAt(7));
		 System.out.println("First index of searching :  "+name.indexOf('P'));
		 System.out.println("Last index of String searching :  "+name.lastIndexOf('e'));
		 System.out.println(name.replace('a', '$'));
		 System.out.println(name.replace("Verma","singh"));
		 System.out.println(name.replace("Verma","singh")); // replace string with another string
		 System.out.println("name change in smaller char :"+name.toLowerCase());
		 System.out.println("name change in Capital char :"+name.toUpperCase());
		 System.out.println(name.startsWith("Pras"));
		 System.out.println(name.endsWith("rma"));
		 System.out.println(name.substring(3,10));
		 
		 
	}
}
