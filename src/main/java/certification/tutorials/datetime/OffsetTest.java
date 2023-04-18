package certification.tutorials.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * Adding three hours to 13:00 makes it 16:00. While this date happens to be the
 * start of daylight saving time, the change occurs at 2 a.m. This code uses
 * 13:00, which is 1 p.m. Since the calculation does not cross 2 a.m., the fact
 * that it is the date that starts daylight saving time is irrelevan
 *
 */

public class OffsetTest {
	public static void main(String[] args) {
		var localDate = LocalDate.of(2022, 3, 13);
		var localTime = LocalTime.of(13, 0);
		var zone = ZoneId.of("America/New_York");
		var z = ZonedDateTime.of(localDate, localTime, zone);

		var offset = z.getOffset();
		var duration = Duration.ofHours(3);
		var later = z.plus(duration);

		System.out.println(later.getHour() + " " + offset.equals(later.getOffset()));
	}

}
