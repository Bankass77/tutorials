package certification.tutorials.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantToLocalDateLocaltimeLocalDateTime {

	public static void main(String[] args) {

		/* Without using ofInstant */
		// Get Instant
		Instant instant = Instant.now();

		// Get the system default time zone
		ZoneId zoneId = ZoneId.systemDefault();

		// Convert Instant to a ZoneDateTime

		ZonedDateTime zdt = instant.atZone(zoneId);

		// Get Locadate to ZoneDateTime

		LocalDate ld = zdt.toLocalDate();

		// Get Localtime to ZoneDateTime

		LocalTime lt = zdt.toLocalTime();

		// Get LocalDateTime to ZoneDateTime
		LocalDateTime ldt = zdt.toLocalDateTime();

		System.out.println("Instant: " + instant);

		System.out.println("Local Date : " + ld);

		System.out.println("Local Time: " + lt);

		System.out.println("Local Date Time: " + ldt);

		/* Using ofInstant */

		LocalDate ldDate = LocalDate.ofInstant(instant, zoneId);

		System.out.println("Local Date: " + ldDate);

		LocalTime ltLocalTime = LocalTime.ofInstant(instant, zoneId);

		System.out.println("Local Time: " + ltLocalTime);
		LocalDateTime ldtDateTime = LocalDateTime.ofInstant(instant, zoneId);
		System.out.println("Local Date Time: " + ldtDateTime);

	}

}
