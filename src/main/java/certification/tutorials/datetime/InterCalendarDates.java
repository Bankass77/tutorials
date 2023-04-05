package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.chrono.ThaiBuddhistDate;

public class InterCalendarDates {

	public static void main(String[] args) {
		
		ThaiBuddhistDate thaiBuddhistDateIsNow= ThaiBuddhistDate.now();
		LocalDate isoNow= LocalDate.now();
		System.out.println("Thai Buddhist Current Date:"+ thaiBuddhistDateIsNow);
		System.out.println("Iso Current Date:"+ isoNow);
		
		// Covert Thai Buddhist date to iso date and vice versa
		ThaiBuddhistDate thaiBuddhistDateNow2= ThaiBuddhistDate.from(isoNow);
		LocalDate isNow2= LocalDate.from(thaiBuddhistDateIsNow);
		System.out.println("Thai Buddhist Current Date from ISO:"+ thaiBuddhistDateNow2);
		System.out.println("Iso Current Date from Thai Buddhist:"+ isNow2);

		HijrahDate hijrahDate= HijrahDate.now();
		LocalDate isNow3= LocalDate.from(hijrahDate);
		HijrahDate hijrahDate2=hijrahDate.from(isNow3);
		
		System.out.println("Hidjara Current Date:"+ hijrahDate);
		System.out.println("Hijara Current Date from Iso:"+ hijrahDate2);
		System.out.println("Iso Current Date from Hijara:"+ isNow3);
		
	}

}
