package certification.tutorials.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {

		// Create the current zoned datetime for the system default time zone

		ZonedDateTime zdt1 = ZonedDateTime.now();
		System.out.println("Current zoned datetime:" + zdt1);
		// Create a local datetime
		LocalDateTime ldt = LocalDateTime.of(2023, Month.MARCH, 24, 14, 24);
		// Create some zoned datetimes
		ZoneId usCentrale = ZoneId.of("America/Chicago");
		ZonedDateTime zdt2 = ZonedDateTime.of(ldt, usCentrale);
		System.out.println(zdt2);
		// Get Zone offset and zone id
		ZoneOffset zo = zdt2.getOffset();
		ZoneId zi = zdt2.getZone();
		System.out.println("Offset:" + zo + ", Zone: " + zi);

		// Substract 10 hours. Zone-offset changes from: +05:00 to -06:00
		ZonedDateTime zdt3 = zdt2.minusHours(10);
		System.out.println("zdt3:" + zdt3);

		// Create a datetime in Asia/Kolkata timùe Zone
		ZoneId indiaKolkata = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt4 = ZonedDateTime.of(ldt, indiaKolkata);
		System.out.println("zdt4:" + zdt4);

		// Perform some conversions on zoned date time
		LocalDateTime ldt2 = zdt4.toLocalDateTime();
		OffsetDateTime odt = zdt4.toOffsetDateTime();
		Instant i1 = zdt4.toInstant();
		System.out.println("To local datetime:" + ldt2);
		System.out.println("To offset datetime:" + odt);
		System.out.println("To instant:" + i1);

	}

}
