package certification.tutorials.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethodCounter {

	private final ReentrantLock lock = new ReentrantLock();

	private int count = 0;

	private int incrementAndGet() {

		// Check if the lock is currently acquired by any thread

		System.out.println("IsLocked: " + lock.isLocked());

		// Check if the lock is acquired by the current thread istsef

		System.out.println("IsHeldByCurrentThread: " + lock.isHeldByCurrentThread());

		// try to acquired the lock
		boolean isAcquired = lock.tryLock();
		System.out.println("Lock Acquired : " + isAcquired + "\n");

		if (isAcquired) {

			try {

				Thread.sleep(2000);
				count++;
			} catch (InterruptedException e) {
				throw new IllegalArgumentException(e);
			} finally {

				lock.unlock();
			}
		}
		return count;

	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		ReentrantLockMethodCounter reentrantLockMethodCounter = new ReentrantLockMethodCounter();

		executorService.submit(() -> {

			System.out.println("Increment count (first thread :" + reentrantLockMethodCounter.incrementAndGet() + "\n");
		});

		executorService.submit(() -> {

			System.out.println("Increment count (secondthread :" + reentrantLockMethodCounter.incrementAndGet() + "\n");
		});

		executorService.shutdown();
	}

}
