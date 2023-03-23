package certification.tutorials.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class InvokeAnyExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Callable<String> tak1 = () -> {

			Thread.sleep(2000);
			return "Result of task1";
		};

		Callable<String> tak2 = () -> {

			Thread.sleep(1000);
			return "Result of task2";
		};

		Callable<String> tak3 = () -> {

			Thread.sleep(5000);
			return "Result of task3";
		};

		List<Callable<String>> taskLists = Arrays.asList(tak1, tak2, tak3);
		/*
		 * List<Future<String>> result= executorService.invokeAll(taskLists);
		 * 
		 * for (Future<String> future : result) {
		 * 
		 * System.out.println(future.get()); }
		 */

		String result = executorService.invokeAny(taskLists, 2, TimeUnit.SECONDS);
		executorService.shutdown();

	}

}
