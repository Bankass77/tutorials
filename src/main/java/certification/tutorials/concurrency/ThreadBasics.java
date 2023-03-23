package certification.tutorials.concurrency;

public class ThreadBasics {

	public static void main(String[] args) {

		ParallelTask task = new ParallelTask();

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();
		System.out.println("Main Thread is finished");

	}

}
