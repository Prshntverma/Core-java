package datee;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {

	public static void main(String[] args) {
		LocalDate todaydate = LocalDate.now();
		System.out.println("today's date: " + todaydate); //providing today date .........
 
		LocalDate birthDate = LocalDate.of(2002, 05, 13);

		System.out.println("your birth date: " + birthDate); // providing date....
		Period p= Period.between(birthDate, todaydate);
		System.out.println(p);
		System.out.println("The Age of sksi is :"+       p.getYears() + " year " + p.getMonths() + " month " + p.getDays() + " days ");
		
	
	}

}
