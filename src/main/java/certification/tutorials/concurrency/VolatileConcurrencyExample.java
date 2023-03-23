package certification.tutorials.concurrency;

import java.util.concurrent.ExecutionException;

public class VolatileConcurrencyExample {

	private static volatile boolean sayHello = false;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Thread t = new Thread(() -> {

			while (!sayHello) {

			}

			System.out.println("Hello World");

			while (sayHello) {

			}

			System.out.println("Good bye!");
		});

		t.start();

		Thread.sleep(1000);
		System.out.println("say Hello...");

		sayHello = true;

		Thread.sleep(1000);
		System.out.println("Say Bye!");

		sayHello = false;
	}

}
