package certification.tutorials.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//Converting a Datetime in a Time Zone to Another Time Zone
public class DateTimeZoneConversion {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.of(2023, Month.MARCH, 24, 14, 41);
		ZoneId usCentrale = ZoneId.of("America/Chicago");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, usCentrale);

		System.out.println("In Us Central Time Zone:" + zdt);
		
		ZoneId asiaKolkata = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zdt2 = zdt.withZoneSameInstant( asiaKolkata);

		System.out.println("In Asia/kolkata Time zone:" + zdt2);
		
		ZonedDateTime zdt3 = zdt.withZoneSameInstant(ZoneId.of("Z"));
		System.out.println("In UTC Time Zone: " + zdt3);
	}

}
