package certification.tutorials.concurrency;

public class ThreadExample extends Thread {

	@Override
	public void run() {

		System.out.println("Thread name is" + " " + Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		System.out.println(" creating thread...");
		Thread t = new ThreadExample();

		System.out.println("Strating the thread...");

		t.start();

	}
}
