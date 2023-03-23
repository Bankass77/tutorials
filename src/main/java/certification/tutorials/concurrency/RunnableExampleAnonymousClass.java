package certification.tutorials.concurrency;

public class RunnableExampleAnonymousClass {

	public static void main(String[] args) {

		System.out.println("Creating  Runnable...");

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside runnable" + " " + Thread.currentThread().getName());

			}
		};

		// thread using lambda expression

		Runnable runnable2 = () -> {

			System.out.println("Inside runnable with lambda" + " " + Thread.currentThread().getName());

		};
		System.out.println("Creating thread...");

		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread(runnable2);

		System.out.println("starting thread");

		thread.start();
		thread2.start();
	}

}
