package certification.tutorials.concurrency;

public class ThreadWithRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("Inside the runnable " + " " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		System.out.println("creating runnable....");
		Runnable runnable = new ThreadWithRunnable();

		System.out.println("Creating thread ...");

		Thread t1 = new Thread(runnable);

		System.out.println("Strat thread ");
		t1.start();

	}

}
