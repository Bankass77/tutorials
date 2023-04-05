package certification.tutorials.datetime;

import java.time.temporal.TemporalAccessor;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;

import java.time.DayOfWeek;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;;

public class CustomQueries {

	public static Boolean isFriday13(TemporalAccessor temporalAccessor) {

		if (temporalAccessor.isSupported(DAY_OF_WEEK) && temporalAccessor.isSupported(DAY_OF_MONTH)) {

			int weekDay = temporalAccessor.get(DAY_OF_WEEK);
			int dayOfMont = temporalAccessor.get(DAY_OF_MONTH);
			DayOfWeek dayOfWeek = DayOfWeek.of(weekDay);

			if (dayOfMont == 13 && dayOfWeek == DayOfWeek.FRIDAY) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
