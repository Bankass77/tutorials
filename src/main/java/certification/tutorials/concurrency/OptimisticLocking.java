package certification.tutorials.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class OptimisticLocking {

	StampedLock lock = new StampedLock();
	ExecutorService executorService = Executors.newFixedThreadPool(2);

	executorService.submit(()->
	{
		
		long stamp= lock.tryOptimisticRead();
		
		try {
			
			System.out.println("Optimistic Lock valid: " + lock.validate(stamp));
			Thread.sleep(2_000);
			System.out.println("Optimistic Lock valid: " + lock.validate(stamp));
			Thread.sleep(2_000);
			System.out.println("Optimistic Lock valid: " + lock.validate(stamp));
			
			
			
		} finally {
			lock.unlock(stamp);
		}
		
	}):

}
