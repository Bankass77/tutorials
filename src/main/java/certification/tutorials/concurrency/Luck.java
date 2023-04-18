package certification.tutorials.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 
 * The following program simulates flipping a coin an even number of times.
 * Assuming five seconds is enough time for all of the tasks to finish, what is
 * the output of the following application? The code compiles and runs without
 * issue. Even though the thread-safe AtomicBoolean is used, it is not used in a
 * thread-safe manner. The flip() method first retrieves the value and then sets
 * a new value. These two calls are not executed together in an atomic or
 * synchronized manner. For this reason, the output could be true or false, with
 * one or more of the flips possibly being lost
 *
 */
public class Luck {
	private AtomicBoolean coin = new AtomicBoolean(false);

	void flip() {
		coin.getAndSet(!coin.get());
	}

	public static void main(String[] gamble) throws Exception {
		var luck = new Luck();
		ExecutorService s = Executors.newCachedThreadPool();
		for (int i = 0; i < 000; i++) {
			s.execute(() -> luck.flip());
		}
		s.shutdown();
		Thread.sleep(5000);
		System.out.println(luck.coin.get());
	}
}
