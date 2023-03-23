package certification.tutorials.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CycleBarrierTestRunnable implements Runnable {

	CyclicBarrier cyclicBarrier;

	public CycleBarrierTestRunnable(CyclicBarrier cyclicBarrier) {
		super();
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " "
				+ "is wainting for all other thread to reach common barrier point");

		try {
			Thread.sleep(1000);
			/**
			 * when all 3 parties will cal await method(i.e common barrier point )
			 * CyclicBarrierEvent will be triggered and all wainting threads will be
			 * released
			 * 
			 * 
			 * 
			 */

			cyclicBarrier.await();
			// cyclicBarrier.await(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

		System.out.println("As all threads have reached common barrier point" + " " + Thread.currentThread().getName()
				+ " " + "has been released.");

	}

}
