package certification.tutorials.predicateConsumer;

import java.util.function.Predicate;

public class HasWarning implements Predicate<Sensor> {

	public static final int BATTERY_WARNING = 10;

	@Override
	public boolean test(Sensor t) {

		return t.batteryHealth() < BATTERY_WARNING;
	}

}
