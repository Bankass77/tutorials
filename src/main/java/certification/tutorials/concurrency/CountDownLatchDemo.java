package certification.tutorials.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(4);

		Worker first = new Worker(1000, latch, "Worker-1");
		Worker second = new Worker(2000, latch, "Worker-2");
		Worker third = new Worker(3000, latch, "Worker-3");
		Worker fourth = new Worker(4000, latch, "Worker-4");

		first.start();
		second.start();
		third.start();
		fourth.start();
		// Main thread will wait until all thread finished
		latch.await();

		System.out.println(Thread.currentThread().getName() + " has started running again");

		latch.await();

		System.out.println(Thread.currentThread().getName() + " has finished");

	}

}

class Worker extends Thread {

	private int delay;

	private CountDownLatch latch;

	public Worker(int delay, CountDownLatch latch, String name) {

		super(name);
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " has finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
