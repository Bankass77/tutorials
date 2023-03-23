package certification.tutorials.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateUntilMethodTest {

	public static void main(String[] args) {

		long sundaysIn2023 = LocalDate.of(2023, 1, 1).datesUntil(LocalDate.of(2024, 1, 1))
				.filter(ld -> ld.getDayOfWeek() == DayOfWeek.SUNDAY).count();
		System.out.println("Number of Sunday in 2023: " + sundaysIn2023);

		System.out.println("Fridays that fall on 13th of the month between 2020 - 2024: ");
		LocalDate.of(2020, 1, 1).datesUntil(LocalDate.of(2025, 1, 1))
				.filter(ld -> ld.getDayOfMonth() == 13 && ld.getDayOfWeek() == DayOfWeek.FRIDAY)
				.forEach(System.out::println);

		System.out.println("Last day of Months in 2023:");

		LocalDate.of(2023, 1, 31).datesUntil(LocalDate.of(2024, 1, 1), Period.ofMonths(1))
				.map(ld -> ld.format(DateTimeFormatter.ofPattern("EEE MMM dd, yyyy"))).forEach(System.out::println);
	}

}
