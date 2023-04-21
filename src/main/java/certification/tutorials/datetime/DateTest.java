package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * The first line of code correctly creates a LocalDate object representing
 * March 3, 2022. The second line adds two days to it, making it March 5. It
 * then subtracts a day, making it March 4. Finally, it subtracts yet another
 * day, ending at March 3. The outcome of all this is that we have two dates
 * that have the same value,
 *
 */
public class DateTest {

	public static void main(String[] args) {
		var date1 = LocalDate.of(2022, Month.MARCH, 3);
		var date2 = date1.plusDays(2).minusDays(1).minusDays(1);
		System.out.println(date1.equals(date2));

	}

}
