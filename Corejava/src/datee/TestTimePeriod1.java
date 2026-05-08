package datee;

	
	import java.time.LocalDate;
	import java.time.Period;

	public class TestTimePeriod1 {

		public static void main(String[] args) {
			LocalDate todayDate = LocalDate.now();

			System.out.println("today's date:-" + todayDate);

			LocalDate birthDate = LocalDate.of(2001, 10, 25);
			System.out.println("your birthdate :-" + birthDate);

			Period period = Period.between(birthDate, todayDate);

			System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + " days ");

		}

	}


