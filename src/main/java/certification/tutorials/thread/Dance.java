package certification.tutorials.thread;

import java.util.ArrayList;

/**
 * 
 * The code compiles and is thread-safe, since the call to step() is
 * synchronized on the same object. The calls to interrupt() have no effect
 * because the threads are never in a waiting state. For this reason, the output
 * is always 10,
 *
 */
public class Dance {
	int count = 0;

	synchronized int step() {
		return count++;
	}

	public static void main(String[] args) throws InterruptedException {
		var waltz = new Dance();
		var dancers = new ArrayList<Thread>();

		for (int i = 0; i < 10; i++)
			dancers.add(new Thread(() -> waltz.step()));
		for (Thread dancer : dancers)
			dancer.start();
		dancers.forEach(d -> d.interrupt());

		Thread.sleep(5_000);
		System.out.print(waltz.count);
	}

}
