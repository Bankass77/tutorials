package certification.tutorials.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedCounter {

	private int count = 0;

	/*
	 * public synchronized void increment() {
	 * 
	 * count++;
	 * 
	 * }
	 */

	// Or

	public void increment() {

		synchronized (this) {
			count++;
		}

	}

	public int getCount() {

		return count;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		SynchronizedCounter counter = new SynchronizedCounter();

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 1000; i++) {
			executorService.submit(() -> {

				counter.increment();
			});
		}

		executorService.shutdown();
		executorService.awaitTermination(60, TimeUnit.SECONDS);

		System.out.println("Final count is:" + counter.getCount());
	}
}
