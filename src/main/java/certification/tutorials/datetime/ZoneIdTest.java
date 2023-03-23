package certification.tutorials.datetime;

import java.time.ZoneId;

public class ZoneIdTest {

	public static void main(String[] args) {
		

		ZoneId usChicago= ZoneId.of("America/Chicago");
		ZoneId bdDhaka= ZoneId.of("Asia/Dhaka");
		ZoneId fixedZoneId= ZoneId.of("+06:00");
		System.out.println("usChicago:"+ usChicago);
		System.out.println("bdDhaka:"+ bdDhaka);
		System.out.println("fixedZoneId:"+ fixedZoneId);
	}

}
