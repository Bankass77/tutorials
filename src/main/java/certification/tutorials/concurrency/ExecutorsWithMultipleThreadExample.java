package certification.tutorials.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsWithMultipleThreadExample {

	public static void main(String[] args) {

		System.out.println("Inside the " + Thread.currentThread().getName());

		System.out.println("Creating Executor service with a thread pool of size 2");

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		Runnable task1 = () -> {

			System.out.println(" Executing task1 inside:" + Thread.currentThread().getName());

			try {

				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				throw new IllegalArgumentException(e);

			}
		};

		Runnable task2 = () -> {

			System.out.println("Executing task2 inside:" + Thread.currentThread().getName());

			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e2) {
				throw new IllegalArgumentException(e2);
			}
		};

		Runnable task3 = () -> {

			System.out.println("Executing task 3 inside:" + Thread.currentThread().getName());

		};

		System.out.println("Submitting the tasks for execution");

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
	}

}
