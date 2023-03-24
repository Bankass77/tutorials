package certification.tutorials.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjusterTest {

	public static void main(String[] args) {
		
		LocalDate ld1 = LocalDate.of(2023, Month.JANUARY, 1);
		LocalDate ld2 = ld1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(ld1);
		System.out.println(ld2);
		
		LocalDate ldDate = ld1.with(TemporalAdjusters.dayOfWeekInMonth(6, DayOfWeek.FRIDAY));
		System.out.println(ldDate);
		
		LocalDate  date= LocalDate.now().plusMonths(3).plusDays(14).with(DateAdjusters.dayOfWeekInMont(2, DayOfWeek.FRIDAY));
		
	}

}
