package certification.tutorials.thread;

public class HelloRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Java Threads!");

	}

	public static void main(String[] args) {
		// creating a instance
		Runnable helloRunnable = new HelloRunnable();

		Runnable aRunnableObject = () -> System.out.println("Hello Java Threads with runnable!");

		Thread myThread = new Thread(aRunnableObject);
		myThread.start();
		Thread myThread2 = new Thread(helloRunnable);
		myThread2.start();
	}

}
