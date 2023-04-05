package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
/**
 * 
 * The key to solving this question is to remember that the execute() method returns void, not a Future object.
 *  Therefore, line n1 does not compile, and option F is the correct answer. If the submit() method had been used instead of execute(), 
 *  it prints null null null null null, 
 * as the output of the submit(Runnable) task is a Future˂?˃ object that can only return null on its get() method.
 *
 */
public class PrintCounter {

	static int count = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		var service = Executors.newSingleThreadExecutor();

		try {

			var r = new ArrayList<Future<?>>();

			IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> r.add(service.execute(() -> {
				count++;
			})));
			
			/*
			 * IntStream.iterate(0, i -> i + 1).limit(5).forEach(i ->
			 * r.add(service.submit(() -> { count++; })));
			 */
			for (Future<?> future : r) {
				System.out.println(future.get() + " ");
			}
		} finally {
			service.shutdown();
		}

	}

}
