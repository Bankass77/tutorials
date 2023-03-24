package certification.tutorials.datetime;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class Partials {

	public static void main(String[] args) {

		// Use Year
		Year y1 = Year.of(2023); // 2023
		Year y2 = y1.minusYears(1); // 2022
		Year y3 = y1.plusYears(2); // 2024
		Year y4 = Year.now(); // Current year
		if (y1.isLeap()) {

			System.out.println(y1 + " "+ "Is a leap year.");
		} else {
			System.out.println(y1 +  " "+  "is not a leap year.");

		}

		// Use YearMonth
		YearMonth ym1 = YearMonth.of(2023, Month.MARCH);
		// Get the number of days in the month
		int montLen = ym1.lengthOfMonth(); // 31
		System.out.println("Days in month in :" + ym1 + ":" + montLen);
		// Get the number of days in the year
		int yearLen = ym1.lengthOfYear(); // 365
		System.out.println("Days in year in:" + ym1 + ":" + yearLen);
		// Use MonthDay
		MonthDay md1 = MonthDay.of(Month.APRIL, 8);
		MonthDay md2 = MonthDay.of(Month.DECEMBER, 3);
		if (md2.isValidYear(2023)) {
			System.out.println(md2 + " occurred in 2023");
		} else {
			System.out.println(md2 + " did not occur in 2023");
		}

	}

}
