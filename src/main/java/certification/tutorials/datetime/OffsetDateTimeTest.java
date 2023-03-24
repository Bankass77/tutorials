package certification.tutorials.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetDateTimeTest {

	public static void main(String[] args) {

		// Get the current offset time
		OffsetTime ot1 = OffsetTime.now();

		System.out.println("Current offset time is:" + ot1);
		// Create a zone offset +05:30
		ZoneOffset zo = ZoneOffset.ofHoursMinutes(5, 30);

		// create an offset time
		OffsetTime Ot2 = OffsetTime.of(16, 40, 20, 0, zo);
		System.out.println("An offset time:" + Ot2);

		// Get the current offset datetime
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println("Current offset datetime: " + odt);
		// Create an offset Date time
		OffsetDateTime odt2 = OffsetDateTime.of(2023, 03, 24, 13, 10, 23, 0, zo);
		System.out.println("An offset datetime: " + odt2);

		// Get the local date and time from the offset datetime
		LocalDate ld = odt.toLocalDate();
		LocalTime lt = odt.toLocalTime();
		System.out.println("Current Local Date: " + ld);
		System.out.println("Current Local Time: " + lt);
		// Get the instant from the offset datetime
		Instant instant = odt.toInstant();

		System.out.println("Current Instant: " + instant);
		// Create an offset datetime from the Instant

		ZoneId usChicago = ZoneId.of("America/Chicago");
		OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, usChicago);
		System.out.println("Offset daytetime from Instant:" + offsetDateTime);
	}

}
