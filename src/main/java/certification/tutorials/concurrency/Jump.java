package certification.tutorials.concurrency;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Jump {

	private static void await(CyclicBarrier b) {
		try {
			b.await();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		ExecutorService s = Executors.newFixedThreadPool(4);
		final var b = new CyclicBarrier(4, () -> System.out.print("Jump"));
		for (int i = 0; i < 10; i++) {
			s.execute(() -> await(b));
			s.shutdown();

		}
	}

}
