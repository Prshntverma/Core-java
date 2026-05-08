package datee;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Maintanance {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		for (int i = 1; i <= 8; i++) {

			cal.add(Calendar.MONTH, 1);

			Date nextEvent = cal.getTime();

			System.out.println("Month " + i + " : " + sdf.format(nextEvent));
		}
	}
}