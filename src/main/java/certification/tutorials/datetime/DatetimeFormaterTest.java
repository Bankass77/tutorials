package certification.tutorials.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * While it is traditional to include the year when outputting a date, it is not
 * required. This code correctly prints the month followed by a decimal point.
 * After the decimal point, it prints the day of the month followed by the hours
 * and minutes. Happy Pi Day!
 *
 */
public class DatetimeFormaterTest {

	public static void main(String[] args) {
		LocalDateTime pi = LocalDateTime.of(2022, 3, 14, 1, 59);
		var formatter = DateTimeFormatter.ofPattern("M.ddhhmm");
		System.out.println(formatter.format(pi));

	}

}
