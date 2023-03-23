package certification.tutorials.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureIsDoneExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> future = executorService.submit(() -> {

			Thread.sleep(2000);
			return "Hello from Callable";
		});

		while (!future.isDone()) {

			System.out.println("Task is still not done...");

			TimeUnit.SECONDS.sleep(200);

		}

		System.out.println("Task completed! Retrieving the result");

		String result = future.get();

		System.out.println("Result is: " + " " + result);
		executorService.shutdown();
	}

}
