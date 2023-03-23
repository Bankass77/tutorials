package certification.tutorials.predicateConsumer;

import java.util.function.Consumer;

public class SendAlarm implements Consumer<Sensor> {

	@Override
	public void accept(Sensor t) {

		if (t.trigerred()) {

			Exercice02.alarmServiceNotified = true;

		}

	}

}
