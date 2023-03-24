package certification.tutorials.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeriodTest {

	public static void main(String[] args) {

		Period p1 = Period.of(2, 3, 5); // 2 years, 3 months, 2 days
		Period p2 = Period.ofDays(25); // 25 days
		Period p3 = Period.ofMonths(-3); // -3 Months
		Period p4 = Period.ofWeeks(3); // 3 weeks (21 days);

		System.out.println("P1:" + p1);
		System.out.println("P2:" + p2);
		System.out.println("P3:" + p3);
		System.out.println("P4:" + p4);
		
		// You can perform additions, subtractions, multiplications, and negation on a period
		
		Period p5= Period.ofDays(15); // P15D
		Period p6=p5.plusDays(12); // P27D
		Period p7= p5.minusDays(12); //P3D
		Period p8= p1.negated(); // P-15D
		Period p9= p1.multipliedBy(3); //P45D
		
		System.out.println("p5:"+p5);
		System.out.println("p6:"+p6);
		System.out.println("p7:"+p7);
		System.out.println("p8:"+p8);
		
		
		Period period = Period.of(2, 3, 5);
		Period period2= Period.of(1, 15, 28);
		System.out.println("period:"+ period);
		System.out.println("period2:"+ period2);
		System.out.println("period.plus(period2):" + period.plus(period2));
		System.out.println("period.plus(period2).normalized():" + period.plus(period2).normalized());
		System.out.println("period.minus(period2):" + period.minus(period2));

		ZoneId usCentral = ZoneId.of("America/Chicago");
		LocalDateTime ldt= LocalDateTime.of(2023, Month.MARCH, 24, 7, 30);
		
		ZonedDateTime zdt= ZonedDateTime.of(ldt, usCentral);
		
		Period period3= Period.ofDays(1);
		Duration duration= Duration.ofHours(24);
		
		// add a period of 1 days and a duration 24 hours
		ZonedDateTime zdDateTime= zdt.plus(period3);
		ZonedDateTime zonedDateTime= zdt.plus(duration);
		
		System.out.println("Start Datetime:"+ zdt);
		System.out.println("After 1 day period:"+ zdDateTime);
		System.out.println("After 24 hours duration:"+ zonedDateTime);
		
	}

}
