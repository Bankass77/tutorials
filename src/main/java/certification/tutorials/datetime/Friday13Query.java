package certification.tutorials.datetime;

import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import static java.time.temporal.ChronoField.DAY_OF_WEEK;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;

public class Friday13Query implements TemporalQuery<Boolean> {

	public static Friday13Query is_FRIDAY_13 = new Friday13Query();

	private Friday13Query() {

	}

	// Prevent outside code from creating objects of this class.
	@Override
	public Boolean queryFrom(TemporalAccessor temporalAccessor) {

		if (temporalAccessor.isSupported(DAY_OF_MONTH) && temporalAccessor.isSupported(DAY_OF_WEEK)) {

			int weekDay = temporalAccessor.get(DAY_OF_WEEK);
			int dayOfMonth = temporalAccessor.get(DAY_OF_MONTH);
			DayOfWeek dayOfWeek = DayOfWeek.of(weekDay);

			if (dayOfMonth == 13 && dayOfWeek == DayOfWeek.FRIDAY) {
				return Boolean.TRUE;
			}
		}

		return Boolean.FALSE;
	}

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2023, Month.OCTOBER, 13);

		Boolean isFriday13 = ld1.query(Friday13Query.is_FRIDAY_13);
		System.out.println("Date:" + ld1 + ", isFriday13: " + isFriday13);

		LocalDate ld2 = LocalDate.of(2023, Month.MARCH, 31);
		isFriday13 = ld2.query(Friday13Query.is_FRIDAY_13);

		System.out.println("Date:" + ld2 + ", isFriday13: " + isFriday13);

		LocalTime lt = LocalTime.of(7, 30, 45);
		isFriday13 = lt.query(Friday13Query.is_FRIDAY_13);

		System.out.println("Time:" + lt + ", isFriday13: " + isFriday13);
	}
}
