package certification.tutorials.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		try {
		   service.execute(() -> takeNap());
		   service.execute(() -> takeNap());
		   service.execute(() -> takeNap());
		} finally {
		   service.shutdown();
		}
		service.awaitTermination(2, TimeUnit.SECONDS);

	}

}
