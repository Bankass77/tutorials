package certification.tutorials.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * The Lock interface does not include an overloaded version of lock() that
 * takes a timeout value and returns a boolean. For this reason, the code does
 * not compile. If tryLock(long,TimeUnit) had been used
 * instead of lock(), then the program would have been expected to print TV Time
 * three times at runtime.
 *
 */
public class Television {
	private static Lock myTurn = new ReentrantLock();

	public void watch() {
		try {
			if (myTurn.lock(5, TimeUnit.SECONDS)/*myTurn.tryLock(5, TimeUnit.SECONDS)*/) {
				System.out.println("TV Time");
				myTurn.unlock();
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] t) throws Exception {
		var newTv = new Television();
		for (int i = 0; i < 3; i++) {
			new Thread(() -> newTv.watch()).start();
			Thread.sleep(10 * 1000);
		}
	}

}
