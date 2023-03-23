package certification.tutorials.concurrency;

import java.util.concurrent.Semaphore;

public class IncrementThread implements Runnable {

	Semaphore semaphore;

	public IncrementThread(Semaphore semaphore) {
		super();
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "" + " is wainting for permit");

		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " " + "has got permit");

			for (int i = 0; i < 5; i++) {

				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ">" + SemaphoreTest.shareValue++);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		semaphore.release();
		System.out.println(Thread.currentThread().getName() + " " + "has released permit");
	}

}
