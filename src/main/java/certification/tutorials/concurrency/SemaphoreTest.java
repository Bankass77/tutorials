package certification.tutorials.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	static int shareValue = 0;

	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(1);

		System.out.println("Semaphore with 1 permit has been created");

		IncrementThread incrementThread = new IncrementThread(semaphore);

		new Thread(incrementThread, "IncrementThread").start();

		DecrementThread decrementThread = new DecrementThread(semaphore);
		new Thread(decrementThread, "DecementThread").start();
	}

}
