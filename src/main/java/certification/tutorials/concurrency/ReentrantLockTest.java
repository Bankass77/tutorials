package certification.tutorials.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * 
 * The tryLock() method returns immediately with a value of false if the lock
 * cannot be acquired. Unlike lock(), it does not wait for a lock to become
 * available. This code fails to check the return value on line 25, resulting in
 * the protected code being entered regardless of whether the lock is obtained.
 * In some executions (when tryLock() returns true on every call), the code will
 * complete successfully and print 45 at runtime. On
 * other executions (when tryLock() returns false at least once), the unlock()
 * method on line 27 will throw an IllegalMonitorStateException at runtime
 *
 */
public class ReentrantLockTest {
	private Lock vault = new ReentrantLock();
	private int total = 0;

	public void deposit(int value) {
		try {
			vault.tryLock();
			total += value;
		} finally {
			vault.unlock();
		}
	}

	public static void main(String[] args) {

		ReentrantLockTest reentrantLock = new ReentrantLockTest();
		IntStream.range(1, 10).parallel().forEach(s -> reentrantLock.deposit(s));
		System.out.println(reentrantLock.total);
	}

}
