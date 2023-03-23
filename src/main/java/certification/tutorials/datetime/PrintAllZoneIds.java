package certification.tutorials.datetime;

import java.time.ZoneId;
import java.util.Set;

public class PrintAllZoneIds {

	public static void main(String[] args) {
		

		Set<String> zoneIds= ZoneId.getAvailableZoneIds();
		
		for (String string : zoneIds) {
			System.out.println("All zoneIds ares:" +string);
		}

	}

}
