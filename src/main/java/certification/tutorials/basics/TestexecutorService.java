package certification.tutorials.basics;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestexecutorService {

	public static void main(String[] args) {
		final var cb = new CyclicBarrier(3, () -> System.out.println("Clean"));// u2
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		try {
			IntStream.generate(() -> 1).limit(12).parallel().forEach(i -> executorService.submit(() -> cb.await()));// u2
		} finally {
			executorService.shutdown();
		}
	}

}
