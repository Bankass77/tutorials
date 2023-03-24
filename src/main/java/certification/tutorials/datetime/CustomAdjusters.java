package certification.tutorials.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class CustomAdjusters {

	public final static TemporalAdjuster WEEKDAYS_WITH_NO_FRIDAY_13 = TemporalAdjusters
			.ofDateAdjuster(CustomAdjusters::getWeekDayNoFriday13);

	// No public constructor as it is a utility class

	private CustomAdjusters() {

	}

	private static LocalDate getWeekDayNoFriday13(LocalDate localDate) {

		// Initialise the new date with the original one

		LocalDate newDate = localDate;
		DayOfWeek day = localDate.getDayOfWeek();
		if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY
				|| (day == DayOfWeek.FRIDAY && localDate.getDayOfMonth() == 13)) {
			// return next day
			newDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}
		return newDate;
	}
}
