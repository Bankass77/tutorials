package certification.tutorials.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicConcurrency {

	private AtomicInteger idCounter = new AtomicInteger(0);

	private int id;

	public AtomicConcurrency() {

		id = idCounter.getAndIncrement();

	}

	// CompareAndSet method

	public static void main(String[] args) {

		AtomicReference<String> str = new AtomicReference<String>("geekific");
		str.compareAndExchange("like", "subscribe");
		System.out.println(str);

		AtomicReference<String> stReference = new AtomicReference<String>("like");

		stReference.compareAndExchange("like", "Subscribe");

		System.out.println(stReference);
	}

}
