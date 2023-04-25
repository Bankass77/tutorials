package certification.tutorials.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * While an Instant represents a specific moment in time using GMT, Java only
 * allows adding or removing units of DAYS or smaller. This code throws an
 * UnsupportedTemporalTypeException because of the attempt to add YEARS.
 * 
 *
 */
public class ZoneDateTimeToInstantTest {

	public static void main(String[] args) {

		var trainDay = LocalDate.of(2022, 5, 14);
		var time = LocalTime.of(10, 0);
		var zone = ZoneId.of("America/Los_Angeles");
		var zdt = ZonedDateTime.of(trainDay, time, zone);

		var instant = zdt.toInstant();
		instant = instant.plus(1, ChronoUnit.YEARS);
		System.out.println(instant);
	}

}
