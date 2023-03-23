package certification.tutorials.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorsPeriodicExample {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

		Runnable task = () -> {

			System.out.println("Executing Task at :" + " " + System.nanoTime());
		};

		System.out.println("Scheduling task to be executed every 2 second with an initial delay of 0 second.");

		scheduledExecutorService.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

	}

}
