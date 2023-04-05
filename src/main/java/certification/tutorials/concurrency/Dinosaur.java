package certification.tutorials.concurrency;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * The code compiles without issue. At runtime, it starts 10 threads and then
 * interrupts each of them while they are sleeping for 100 seconds. For each
 * thread, the first distance++ is executed, but the second is not. For this
 * reason, the maximum value printed is 10. We say maximum, because the volatile
 * instance variable distance is not thread-safe. It’s possible the same value
 * could be written twice. Note that using CopyOnWriteArrayList over a regular
 * ArrayList has no impact on this program.
 *
 */
public class Dinosaur {
	private volatile int distance;

	public void stomp() {
		try {
			++distance;
			Thread.sleep(100 * 1000);
			distance++;
		} catch (InterruptedException e) {
		}
	}

	private void findBreakfast(int checks) {
		var p = new CopyOnWriteArrayList<Thread>();
		for (int i = 0; i < checks; i++)
			p.add(new Thread(this::stomp));
		p.forEach(t -> t.start());
		p.forEach(t -> t.interrupt());
	}

	public static void main(String[] args) throws Exception {
		var ship = new Dinosaur();
		ship.findBreakfast(10);
		Thread.sleep(10 * 1000);
		System.out.print(ship.distance);
	}

}
