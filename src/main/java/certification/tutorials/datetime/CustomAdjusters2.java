package certification.tutorials.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class CustomAdjusters2 {

	public static TemporalAdjuster WEEK_DAY_NO_FRIDAY_13 = TemporalAdjusters
			.ofDateAdjuster(CustomAdjusters2::getDayOfWeekNoFriday13);

	private CustomAdjusters2() {

	}

	public static LocalDate getDayOfWeekNoFriday13(LocalDate localDate) {

		LocalDate newDate = localDate;

		DayOfWeek day = localDate.getDayOfWeek();

		if (day == DayOfWeek.SATURDAY
				|| day == DayOfWeek.SUNDAY | (day == DayOfWeek.FRIDAY && localDate.getDayOfMonth() == 13)) {

			// Return next MONDAY

			newDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		}

		return newDate;
	}

	
	
	public static void main(String[] args) {
		
		LocalDate localDate= LocalDate.of(2023, Month.MAY, 12);
		LocalDate localDate2= LocalDate.of(2023, Month.MAY, 13);
		LocalDate localDate3= LocalDate.of(2023, Month.MAY, 14);
		
		LocalDate localDateAdjusted= localDate.with(CustomAdjusters2.WEEK_DAY_NO_FRIDAY_13);
		System.out.println(localDate + " Adjusted to:"+ localDateAdjusted);
		
		LocalDate localDate2Adjusted=  localDate2.with(WEEK_DAY_NO_FRIDAY_13);
		System.out.println(localDate2 + " Adjusted to:"+ localDate2Adjusted);
		
		LocalDate localDate3Adjusted=  localDate3.with(WEEK_DAY_NO_FRIDAY_13);
		System.out.println(localDate3 + " Adjusted to:"+ localDate3Adjusted);
		
		ZonedDateTime  zdt= ZonedDateTime.of(localDate, LocalTime.of(14, 30), ZoneId.of("America/Chicago"));
		
		ZonedDateTime zdtAdjusted= zdt.with(CustomAdjusters2.WEEK_DAY_NO_FRIDAY_13);
		System.out.println(zdt+ "Adusted to:" + zdtAdjusted);
	}
}
