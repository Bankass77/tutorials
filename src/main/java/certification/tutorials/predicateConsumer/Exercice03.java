package certification.tutorials.predicateConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice03 {

	public static void main(String[] args) {
		List<Sensor> sensors = new ArrayList<Sensor>();
		sensors.add(new Gateway(34, false));
		sensors.add(new Gateway(14, true));
		sensors.add(new Gateway(74, false));
		sensors.add(new Fire(87, false,21));
		sensors.add(new Gateway(18, true));
		sensors.add(new Gateway(87, false));
		sensors.add(new Fire(32, false, 23));
		sensors.add(new Gateway(9, false));
		sensors.add(new Mouvement(76, false, 41));
		ExtractBatteryHealth extractBatteryHealth=  new ExtractBatteryHealth();
		
		Integer [] batteryHealths= sensors.stream().map(extractBatteryHealth).toArray(Integer []::new);
	System.out.println(Arrays.toString(batteryHealths));
	}

}
