package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class TimeBetween {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2023, Month.MARCH, 7);
		LocalDate ld2 = LocalDate.of(2023, Month.JANUARY, 18);
		long days = DAYS.between(ld2, ld);
		LocalTime lt = LocalTime.of(7, 40);
		LocalTime lt2 = LocalTime.of(9, 0);
		long hours = HOURS.between(lt, lt2);
		long minutes = MINUTES.between(lt, lt2);
		System.out.println("Using between (day):" + days);
		System.out.println("Using between (hous):" + hours);
		System.out.println("Using between (minutes):" + minutes);

		// Using the until() method
		
		long day2= ld2.until(ld,DAYS);
		long hours2= lt.until(lt2, HOURS);
		long minutes2= lt.until(lt2, MINUTES);
		System.out.println("Using until (day):" + day2);
		System.out.println("Using until (hous):" + hours2);
		System.out.println("Using until (minutes):" + minutes2);
		
	}

}
