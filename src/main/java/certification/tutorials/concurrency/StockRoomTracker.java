package certification.tutorials.concurrency;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

/**
 * 
 * The limit on the cyclic barrier is 10, but the stream can generate only up to
 * 9 threads that reach the barrier; therefore, the limit can never be reached.
 * Even if the limit(9) statement was changed to limit(10), the program could
 * still hang since the JVM might not allocate 10 threads to the parallel
 * stream.
 *
 */
public class StockRoomTracker {
	public static void await(CyclicBarrier cb) { // j1
		try {
			cb.await();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		var cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full!")); // j2
		IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb)); // j3
	}

}
