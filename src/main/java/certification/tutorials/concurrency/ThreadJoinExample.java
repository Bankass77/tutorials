package certification.tutorials.concurrency;

public class ThreadJoinExample {

	public static void main(String[] args) {

		// Create thread 1
		Thread thread = new Thread(() -> {

			System.out.println("Entred Thread 1");

			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				throw new IllegalArgumentException(e);
			}

			System.out.println("Exiting Thread 1");
		});

		// Create thread 2

		Thread thread2 = new Thread(() -> {

			System.out.println("Entred thread 2");

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {

				throw new IllegalArgumentException(e);
			}
			System.out.println("Exiting thread 2");
		});

		System.out.println("starting thread 1");
		thread.start();

		System.out.println("Wainting for thread 1 to complete");

		try {
			thread.join(1000);
		} catch (InterruptedException e) {

			throw new IllegalArgumentException(e);
		}
		System.out.println("Waited enough! starting thread 2 now");
		thread2.start();
	}

}
