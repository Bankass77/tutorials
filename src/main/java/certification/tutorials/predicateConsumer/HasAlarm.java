package certification.tutorials.predicateConsumer;

import java.util.function.Predicate;

public class HasAlarm implements Predicate<Sensor> {

	@Override
	public boolean test(Sensor t) {

		return t.trigerred();
	}

}
