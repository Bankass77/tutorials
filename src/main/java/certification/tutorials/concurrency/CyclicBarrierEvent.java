package certification.tutorials.concurrency;

public class CyclicBarrierEvent implements Runnable {

	@Override
	public void run() {

		System.out.println(
				"As all threads have reached common barrier point" + ", CyclicBarrierEvent has been triggered");

	}

}
