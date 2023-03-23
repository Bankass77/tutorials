package certification.tutorials.predicateConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercice02 {

	static boolean alarmServiceNotified;

	public static void main(String[] args) {

		List<Sensor> sensors = new ArrayList<Sensor>();
		sensors.add(new Gateway(34, false));
		sensors.add(new Gateway(14, true));
		sensors.add(new Gateway(74, false));
		sensors.add(new Gateway(8, false));
		sensors.add(new Gateway(18, true));
		sensors.add(new Gateway(9, false));

		Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new HasWarning());

		SendAlarm sendAlarm = new SendAlarm();
		sensors.stream().filter(hasAlarmOrWarning).forEach(sendAlarm.andThen(sendAlarm));

		if (sensors.stream().anyMatch(hasAlarmOrWarning)) {
			System.out.println("Alarm or warning was triggered");
		}

		ResetAlarm resetAlarm = new ResetAlarm();
		sensors.stream().filter(hasAlarmOrWarning).forEach(sendAlarm.andThen(resetAlarm));
		if (alarmServiceNotified) {
			System.out.println("Alarm service notified");
		}

		if (sensors.stream().anyMatch(hasAlarmOrWarning.negate())) {
			System.out.println("Nothing was triggered");
		}

	}

}
