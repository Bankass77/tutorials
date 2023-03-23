package certification.tutorials.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		// Get the date time 4 days ago
		LocalDateTime ldt2 = now.minus(4, ChronoUnit.DAYS);
		// Use the minusDays() method to get the same result
		LocalDateTime ldt3 = now.minusDays(4);
		// Get date and time 4 hours later
		LocalDateTime ldt4 = now.plus(4, ChronoUnit.HOURS);
		// Use the plusHours() method to get the same result
		LocalDateTime ldt5 = now.plusHours(4);
		System.out.println("Current Datetime: " + now);
		System.out.println("4 days ago: " + ldt2);
		System.out.println("4 days ago: " + ldt3);
		System.out.println("4 hours after: " + ldt4);
		System.out.println("4 hours after: " + ldt5);

	}

}
