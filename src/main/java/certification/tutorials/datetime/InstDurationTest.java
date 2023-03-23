package certification.tutorials.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstDurationTest {

	public static void main(String[] args) {

		Instant i1 = Instant.ofEpochSecond(20);
		Instant i2 = Instant.ofEpochSecond(55);
		System.out.println("i1:" + i1);
		System.out.println("i2:" + i2);
		Duration d1 = Duration.ofSeconds(55);
		Duration d2 = Duration.ofSeconds(-17);
		System.out.println("d1:" + d1);
		System.out.println("d2:" + d2);

		// Compare instants

		System.out.println("i1.isBefore(i2):" + i1.isBefore(i2));
		System.out.println("i2.isAfter(i1):" + i2.isAfter(i1));

		// Add and subtract durations to instants

		Instant i3 = i1.plus(d1);
		Instant i4 = i2.minus(d2);

		System.out.println("i1.plus(d1):" + i3);
		System.out.println("i2.minus(d2):" + i4);

		// Add two durations

		Duration d3 = d1.plus(d2);

		System.out.println("d1.plus(d2):" + d3);
		
		
		// Create a duration of 23 days, 3 hours, 45 minutes, and 30 seconds
		
		
		Duration compTime= Duration.ofDays(23).plusHours(3).plusMinutes(45).plusSeconds(30);
		System.out.println("Duration: "+ compTime);  // Duration: PT555H45M30S
		
		//The following snippet of code shows you how to compute number of whole days, weeks, and hours in a duration
		
		long wholeDays= compTime.dividedBy(Duration.ofDays(1));
		long wholeWeeks= compTime.dividedBy(Duration.ofDays(7));
		long wholeHours= compTime.dividedBy(Duration.ofHours(7));
		System.out.println("Number of whole days:" +wholeDays);
		System.out.println("Number of whole weeks:" +wholeWeeks);
		System.out.println("Number of whole Hours:" +wholeHours);
		
		//Converting and Retrieving Duration Parts
		System.out.println("toDays():" + compTime.toDays());
		System.out.println("toDaysPart():" + compTime.toDaysPart());
		System.out.println("toHours():" + compTime.toHours());
		System.out.println("toHoursPart():" + compTime.toHoursPart());
		System.out.println("toMinutes():" + compTime.toMinutes());
		System.out.println("toMinutesPart():" + compTime.toMinutesPart());
		
		// Truncating a duration
		
		System.out.println("Truncated to Days:" +compTime.truncatedTo(ChronoUnit.DAYS));//Truncated to DAYS: PT552H
		System.out.println("Truncated to Hours:" +compTime.truncatedTo(ChronoUnit.HOURS));// Truncated to HOURS: PT555H
		System.out.println("Truncated to Minutes:" +compTime.truncatedTo(ChronoUnit.MINUTES)); //Truncated to MINUTES: PT555H45M
		
	}

}
