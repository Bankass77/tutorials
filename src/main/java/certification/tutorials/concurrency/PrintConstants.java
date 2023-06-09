package certification.tutorials.concurrency;

import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class PrintConstants {

	public static void main(String[] args) {
		var s = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159, 2.71828) // b1
				.forEach(c -> s.submit( // b2
						() -> System.out.println(10 * c))); // b3
		s.execute(() -> System.out.println("Printed"));
	}

}
