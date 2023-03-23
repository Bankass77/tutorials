package certification.tutorials.concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new CyclicBarrierEvent());

		System.out.println("CountDownLatch has been created with parties=3,"
				+ "when all 3 parties will reach common barrier point" + "CyclicBarrierEvent will triggered");

		CycleBarrierTestRunnable cycleBarrierTestRunnable = new CycleBarrierTestRunnable(cyclicBarrier);

		// Create and start 3 Threads
		new Thread(cycleBarrierTestRunnable, "Thread-1").start();
		new Thread(cycleBarrierTestRunnable, "Thread-2").start();
		new Thread(cycleBarrierTestRunnable, "Thread-3").start();

	}

}
