package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocaldateTimeTest {

	public static void main(String[] args) {
		// Create a local date and time
		LocalDate ld = LocalDate.of(2021, Month.MAY, 11);
		LocalTime lt = LocalTime.of(8, 52, 23);

		System.out.println("ld: " + ld);
		System.out.println("ld.isLeapYear(): " + ld.isLeapYear());
		System.out.println("lt: " + ld);
// Create a local datetime from the local date and time
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println("ldt: " + lt);
// Add 2 months and 25 minutes to the local datetime
		LocalDateTime ldt2 = ldt.plusMonths(2).plusMinutes(25);
		System.out.println("ldt2: " + ldt2);
// Derive the local date and time from the localdatetime
		LocalDate ld2 = LocalDate.from(ldt2);
		LocalTime lt2 = LocalTime.from(ldt2);
		System.out.println("ld2: " + ld2);
		System.out.println("lt2: " + lt2);
		
		
		LocalDate ld1= LocalDate.of(2023, Month.JANUARY, 31);
		LocalDate ld3=ld1.plusDays(30);
		LocalDate ld4=ld1.plusDays(555);
		System.out.println("ld1:"+ld1);
		System.out.println("ld3:"+ld3);
		System.out.println("ld4:"+ld4);
		

	}

}
