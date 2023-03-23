package certification.tutorials.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class LockConcurrency {

	ReentrantLock lock = new ReentrantLock();

	int count = 0;

	void increment() {

		lock.lock();

		try {
			count += 1;
		} finally {
			lock.unlock();
		}
	}

}
