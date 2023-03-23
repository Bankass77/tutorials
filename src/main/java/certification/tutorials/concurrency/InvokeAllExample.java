package certification.tutorials.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newScheduledThreadPool(5);

		Callable<String> task1 = () -> {

			Thread.sleep(2000);

			return "Result of task1";
		};

		Callable<String> task2 = () -> {

			Thread.sleep(1000);
			return "Result of task2";
		};

		Callable<String> task3 = () -> {

			Thread.sleep(5000);
			return "Return of task3";
		};

		List<Callable<String>> taskLists = Arrays.asList(task1, task2, task3);

		List<Future<String>> futures = executorService.invokeAll(taskLists);

		for (Future<String> future : futures) {

			System.out.println("Future is:" + future.get());
		}
		executorService.shutdown();

	}

}
