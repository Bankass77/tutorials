package certification.tutorials.predicateConsumer;

import java.util.function.Function;

public class ExtractBatteryHealth implements Function<Sensor, Integer> {

	@Override
	public Integer apply(Sensor t) {

		return t.batteryHealth();
	}

}
