package certification.tutorials.concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriterCounter {

	ReadWriteLock readwrite = new ReentrantReadWriteLock();
	private int count = 0;

	public int incrementAndGet() {

		readwrite.writeLock();

		try {
			count++;
			return count;
		} finally {
			readwrite.writeLock().unlock();
		}

	}

	private int getCount() {

		readwrite.readLock();

		try {

			return count;
		} finally {
			readwrite.readLock().unlock();
		}

	}

}
