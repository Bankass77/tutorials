package certification.tutorials.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

		Runnable task1 = () -> {

			System.out.println("Executing Task at:" + System.nanoTime());

		};

		System.out.println("Submitting task at" + " " + System.nanoTime() + "to be executed after  5 second");

		scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);

		System.out.println("Shutting executor service");

		scheduledExecutorService.shutdown();
	}

}
