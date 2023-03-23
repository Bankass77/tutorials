package certification.tutorials.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantConcurrency {

	private final ReentrantLock lock = new ReentrantLock();

	private int count = 0;

	public void increment() {

		lock.lock();
		try {
			count++;
		} finally {

			lock.unlock();
		}
	}

}
