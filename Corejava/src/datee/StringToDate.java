package datee;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class StringToDate {
	public static void main(String[] args) throws ParseException {
		
		String str = "25/10/2001";
		
		SimpleDateFormat de = new SimpleDateFormat("dd/MM/yyyy");
		 Date d =de.parse(str);
		 System.out.println(d);
}
}