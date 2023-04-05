package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 
 * The return type of performCount() is void, so submit() is interpreted as
 * being applied to a Runnable expression. While submit(Runnable) does return a
 * Future˂?˃, calling get() on it always returns null. he performCount() method
 * can also throw a runtime exception, which will then be thrown by the get()
 * call as an ExecutionException; Finally, it is also possible for our
 * performCount() to hang indefinitely, such as with a deadlock or infinite
 * loop. Luckily, the call to get() includes a timeout value. While each call to
 * Future.get() can wait up to a day for a result, it will eventually finish,
 *
 */
public class CountZooAnimals {
	public static void performCount(int animal) {
		// IMPLEMENTATION OMITTED
	}

	public static void printResults(Future<?> f) {
		try {
			System.out.println(f.get(1, TimeUnit.DAYS)); // o1
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}

	public static void main(String[] args) throws Exception {
		final var r = new ArrayList<Future<?>>();
		ExecutorService s = Executors.newSingleThreadExecutor();
		try {
			for (int i = 0; i < 10; i++) {
				final int animal = i;
				r.add(s.submit(() -> performCount(animal))); // o2
			}
			r.forEach(f -> printResults(f));
		} finally {
			s.shutdown();
		}
		
	}

}
