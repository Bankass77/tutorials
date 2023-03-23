package certification.tutorials.concurrency;

public class TestThread {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(" test runnable");

			}
		}).start();

		// In java 8 using lambda functions
		new Thread(() -> {
			System.out.println(" test runnable  with java 8 lambda functions.");
		}).start();
	}

}
