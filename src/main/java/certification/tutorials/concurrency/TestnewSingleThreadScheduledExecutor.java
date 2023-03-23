package certification.tutorials.concurrency;

import java.util.concurrent.Executors;

public class TestnewSingleThreadScheduledExecutor {

	public static void main(String[] args) {
		var service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(() -> {
			System.out.println("Open Zoo");
		}, 0, 1);
		var result = service.submit(() -> System.out.println("Wake Staff"));
		System.out.println(result.get());
	}

}
