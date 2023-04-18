package certification.tutorials.thread;

public class PrinterThread {

	public static void main(String[] args) {

		// create a Thread object

		Thread thread = new Thread(PrinterThread::print);
		thread.start();
	}

	public static void print() {
		for (int i = 0; i <= 500; i++) {

			System.out.println(i + " ");
		}
	}

}
