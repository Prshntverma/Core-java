package datee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormate1 {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Default Format date = " + d);
		
		String s = sdf.format(d);
		System.out.println("Formatted Date = " + s);

		System.out.println("--------------------------------");

//		String dob = "2004-06-05";
//		System.out.println("String dob = " + dob);
//		
//		Date date = sdf.parse(dob);
//		System.out.println("Parsed date = " + date);
	}
}