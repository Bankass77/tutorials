package certification.tutorials.concurrency;

import java.util.concurrent.TimeUnit;

public class ParallelTask implements Runnable {

	@Override
	public void run() {

		try {
			TimeUnit.MILLISECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(Thread.currentThread().getName() + " is executing Paralleltask");
		}
	}

}
