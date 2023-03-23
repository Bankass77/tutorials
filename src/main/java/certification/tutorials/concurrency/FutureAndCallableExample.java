package certification.tutorials.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Callable<String> callable = () -> {

			System.out.println("Entred Callable");
			Thread.sleep(2000);

			return "Hello from Callable";

		};

		System.out.println("Submitting Callable");
		Future<String> future = executorService.submit(callable);

		System.out.println("Retrieve the result of the future");

		String result = future.get();

		System.out.println("The future result is: " + " " + result);

		executorService.shutdown();

	}

}
