package certification.tutorials.thread;

public class MultiThreadPrinter {

	public static void main(String[] args) {

		Thread t1 = new Thread(MultiThreadPrinter::print);
		Thread t2 = new Thread(MultiThreadPrinter::print);

		// start both thread

		t1.start();
		t2.start();

	}

	public static void print() {
		for (int i = 0; i <= 500; i++) {
			System.out.println(i);
		}
	}

}
