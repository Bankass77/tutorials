package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * 
 * The DateTimeFormatter is created with ofLocalizedDate(). It knows how to
 * format date fields but not time fields. Line 28 is fine because a LocalDate
 * clearly has date fields. Line 29 is also fine. Since a LocalDateTime has both
 * date and time fields, the formatter just looks at the date fields. Line 30 is
 * a problem. A LocalTime object does not have any date fields so the formatter
 * throws an UnsupportedTemporalTypeException,
 *
 */
public class DateTimeFormatterTest {

	public static void main(String[] args) {
		LocalDate pieDay = LocalDate.of(2022, Month.JANUARY, 23);
		LocalTime midnight = LocalTime.of(0, 0);
		LocalDateTime pieTime = LocalDateTime.of(pieDay, midnight);

		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		f.format(pieDay);
		f.format(pieTime);
		f.format(midnight);

	}

}
