package certification.tutorials.predicateConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercice01 {

	public static void main(String[] args) {

		List<Sensor> sensors = new ArrayList<Sensor>();
		sensors.add(new Gateway(34, false));
		sensors.add(new Gateway(14, true));
		sensors.add(new Gateway(74, false));
		sensors.add(new Gateway(8, false));
		sensors.add(new Gateway(18, true));
		sensors.add(new Gateway(9, false));

		Predicate<Sensor> hasAlarmOrWarning = new HasAlarm().or(new HasWarning());

		for (Sensor sensor : sensors) {

			if (new HasAlarm().test(sensor)) {

				System.out.println("Alarm was trigged");

			}

			if (hasAlarmOrWarning.test(sensor)) {

				System.out.println("Alarm or warning was trigered");

			}
		}

	}

}
