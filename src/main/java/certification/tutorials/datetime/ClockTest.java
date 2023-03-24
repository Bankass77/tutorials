package certification.tutorials.datetime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockTest {

	public static void main(String[] args) {
		

		Clock clock= Clock.systemDefaultZone();
		System.out.println("Clock for system default:"+ clock);
		// Get a clock for Asia/Kolkata time zone
		ZoneId  zi= ZoneId.of("Asia/Kolkata");
		Clock clock2= Clock.system(zi);
		System.out.println("clock2:"+ clock2);
		
		// Get the system default clock
		Clock systemDefaultClock= Clock.systemDefaultZone();
		
		// Get the current Instant of the clock
		Instant instantClock= systemDefaultClock.instant();
		System.out.println("instantClock:"+ instantClock);
		// Get the local date using the clock
		
		LocalDate ld= LocalDate.now(systemDefaultClock);
		// Get the zoned datetime using the clock
		ZonedDateTime zdt= ZonedDateTime.now(systemDefaultClock);
		System.out.println("Zone date time with the clock:"+ zdt);
		Instant instant= Instant.now(clock2);
		System.out.println("Instant with clock2:"+ instant);
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println("lt1:"+lt1);
		System.out.println("lt2:"+ lt2);
		
		Clock clock3= Clock.tick(Clock.systemDefaultZone(), Duration.ofMillis(1));
		System.out.println("clock3:"+ clock3);
		

	}

}
