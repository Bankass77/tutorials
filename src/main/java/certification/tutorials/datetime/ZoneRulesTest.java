package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;
import java.util.List;

public class ZoneRulesTest {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Current date time is:" + ldt);
		ZoneId fixedZoneId = ZoneId.of("+06:00");
		ZoneId bdDakha = ZoneId.of("Asia/Dhaka");
		ZoneId usChicago = ZoneId.of("America/Chicago");

		// Print some zone rules for ZoneIds
		printDetails(fixedZoneId, ldt);
		printDetails(bdDakha, ldt);
		printDetails(usChicago, ldt);

	}

	private static void printDetails(ZoneId zoneId, LocalDateTime ldt) {

		System.out.println("Zone ID: " + zoneId);
		ZoneRules zoneRules = zoneId.getRules();
		boolean isFixedOffset = zoneRules.isFixedOffset();
		System.out.println("isFixedOffset:" + isFixedOffset);

		ZoneOffset offset = zoneRules.getOffset(ldt);
		System.out.println("Zone offset:" + offset);
		List<ZoneOffsetTransition> transitions = zoneRules.getTransitions();
		System.out.println("Transitions:" + transitions);

		System.out.println("Years:" + ldt.get(ChronoField.YEAR));
		System.out.println("Month:" + ldt.get(ChronoField.MONTH_OF_YEAR));
		System.out.println("Day:" + ldt.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Hour-of-day:" + ldt.get(ChronoField.HOUR_OF_DAY));
		System.out.println("Hour-of-AMPM: " + ldt.get(ChronoField.HOUR_OF_AMPM));
		System.out.println("AMPM-of-day: " + ldt.get(ChronoField.AMPM_OF_DAY));

		LocalDate today = LocalDate.now();
		System.out.println("Current Date : " + today);
		System.out.println("LocalDate supports year: " + today.isSupported(ChronoField.YEAR));
		System.out.println("LocalDate supports hour-of-day: " + today.isSupported(ChronoField.HOUR_OF_DAY));
		System.out.println("Year is supported by LocalDate: " + ChronoField.YEAR.isSupportedBy(today));
		System.out.println("Hour-of-day is supported by LocalDate: " + ChronoField.HOUR_OF_DAY.isSupportedBy(today));

	}

}
