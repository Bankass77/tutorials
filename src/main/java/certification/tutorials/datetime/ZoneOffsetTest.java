package certification.tutorials.datetime;

import java.time.ZoneOffset;

public class ZoneOffsetTest {

	public static void main(String[] args) {
		
		// Create zone offset with hour, munites, and seconds
		
		ZoneOffset zoneOffset= ZoneOffset.ofHours(-6);
		ZoneOffset zoneOffset2= ZoneOffset.ofHoursMinutes(5, 30);
		ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutesSeconds(8, 30, 45);
		System.out.println(zoneOffset);
		System.out.println(zoneOffset2);
		System.out.println(zoneOffset3);
		
		
		// Create Zone offset using offset ID as a string
		ZoneOffset zos1= ZoneOffset.of("+05:00");
		ZoneOffset zos2= ZoneOffset.of("Z"); // Same as ZoneOffest.UTC
		System.out.println(zos1);
		System.out.println(zos2);
		
		// Print the values for zo,ne offset constants
		
		System.out.println("ZoneOffset.UTC:"+ ZoneOffset.UTC);
		System.out.println("ZoneOffset.MAX:"+ ZoneOffset.MAX);
		System.out.println("ZoneOffset.MIN:"+ ZoneOffset.MIN);
		
		// Compare to Zone Offset
		System.out.println(zoneOffset.compareTo(zos2));
	}

}
