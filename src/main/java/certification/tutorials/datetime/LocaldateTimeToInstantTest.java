package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * An Instant represents a specific moment in time using GMT. Since
 * LocalDateTime does not have a time zone, it cannot be converted to a specific
 * moment in time. Therefore, the toInstant() call does not compile
 *
 */
public class LocaldateTimeToInstantTest {

	public static void main(String[] args) {
		var date = LocalDate.of(2022, 5, 13);
		var time = LocalTime.of(10, 0);
		var trainDay = LocalDateTime.of(date, time);
		var instant = trainDay.toInstant();
		instant = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(instant);

	}

}
