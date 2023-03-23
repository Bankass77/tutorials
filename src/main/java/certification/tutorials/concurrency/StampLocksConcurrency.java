package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class StampLocksConcurrency {
	
	List<String> list= new ArrayList<>();
	
	StampedLock lock= new StampedLock();
	
	ExecutorService executorService=Executors.newFixedThreadPool(2);
	
	Runnable writeTask = ()-> {
		
		long stamp = lock.writeLock();
		
		try {
			list.add("geekefic");
			try {
				Thread.sleep(2_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			lock.unlock(stamp);
		}
		
	};
	
	
	Runnable readTask= () ->{
		long stamp= lock.readLock();
		try {
			System.out.println(list.get(0));
			try {
				Thread.sleep(2_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  finally {
			lock.unlock(stamp);
		}
		
	};
	
	executorService.submit(writeTask);
	executorService.submit(readTask);


}
