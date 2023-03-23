package certification.tutorials.concurrency;
/**
 * 
 * StampedLock is an alternative to using a ReadWriteLock (implemented by ReentrantReadWriteLock). 
 * The main differences between StampedLock and ReentrantReadWriteLock are that:
 * StampedLocks allow optimistic locking for read operations
 * ReentrantLocks are reentrant (StampedLocks are not)
 * So if you have a scenario where you have contention (otherwise you may as well use synchronized or a simple Lock) 
 * and more readers than writers, using a StampedLock can significantly improve performance.
 *
 */
public class StampedLockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
