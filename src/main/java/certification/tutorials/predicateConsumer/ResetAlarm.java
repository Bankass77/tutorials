package certification.tutorials.predicateConsumer;

import java.util.function.Consumer;

public class ResetAlarm implements Consumer<Sensor> {

	@Override
	public void accept(Sensor t) {
		
		t.triggered(false);
		t.batteryHealth(50);
		Exercice02.alarmServiceNotified= false;

	}

}
