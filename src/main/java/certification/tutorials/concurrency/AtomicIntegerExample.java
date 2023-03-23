package certification.tutorials.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		AtomicCounter counter = new AtomicCounter();

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 1000; i++) {

			executorService.submit(() -> {

				counter.incrementAndGet();
			});
		}

		executorService.shutdown();

		executorService.awaitTermination(60, TimeUnit.SECONDS);

		System.out.println("Final count is: " + " " + counter.getCount());
	}

}
