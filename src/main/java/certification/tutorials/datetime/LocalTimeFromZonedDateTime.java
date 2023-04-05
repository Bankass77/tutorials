package certification.tutorials.datetime;

import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalQueries;

public class LocalTimeFromZonedDateTime {

	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now();
		// Use to toLocalTime() method of the ZonedDateTime class (peferred)
		LocalTime lt = zdt.toLocalTime();

		// Use the from() method of the LocalTime class

		LocalTime lt2 = LocalTime.from(zdt);

		// Use the localTime() query
		LocalTime lt3 = zdt.query(TemporalQueries.localTime());
		// Use the LocalTime::from method as query
		LocalTime lt4 = zdt.query(LocalTime::from);

		// Get all time Components and construct a LocalTime
		int hours = zdt.getHour();
		int minutes = zdt.getMinute();
		int seconds = zdt.getSecond();
		int nanos = zdt.getNano();
		LocalTime lt5 = LocalTime.of(hours, minutes, seconds, nanos);
		
		System.out.println("zdt:"+ zdt);
		System.out.println("lt:"+ lt);
		System.out.println("lt2:"+ lt2);
		System.out.println("lt3:"+ lt3);
		System.out.println("lt4:"+ lt4);
		System.out.println("lt5:"+ lt5);

	}

}
