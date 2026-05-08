package strings;

public class ReverseString {

	public static void main(String[] args) {
		String a = new String("Prashant Ver");

		System.out.println("the Present String  : " + a);
		System.out.print("the Reverse String  : ");
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}

	}
}
