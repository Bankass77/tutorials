package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class TemporalQueryTest {

	public static void main(String[] args) {

		// Get references of the precision and local date queries
		TemporalQuery<TemporalUnit> precisionQuery = TemporalQueries.precision();

		TemporalQuery<LocalDate> loaclDateQuery = TemporalQueries.localDate();

		// Query a LocalDate
		LocalDate ld = LocalDate.now();

		TemporalUnit precision = ld.query(precisionQuery);
		LocalDate queryDate = ld.query(loaclDateQuery);
		System.out.println("Precision of localDate:" + precision);
		
		System.out.println("LocalDate of LocalDate:"+ queryDate);
		
		// Queries a ZoneDateTime
		ZonedDateTime  zdt= ZonedDateTime.now();
		precision= zdt.query(precisionQuery);
		queryDate= zdt.query(loaclDateQuery);
		System.out.println("Precision of ZonedDatime:"+ precision);
		System.out.println("LocalDate  of ZonedDatime:"+ queryDate);
		
	}

}
