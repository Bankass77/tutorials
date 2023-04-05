package certification.tutorials.stream;

import java.util.stream.LongStream;

/**
 * 
 * Be wary of run() vs. start() on the exam! The method looks like it executes a
 * task concurrently, but it runs synchronously. In each iteration of the
 * forEach() loop, the process waits for the run() method to complete before
 * moving on. For this reason, the code is thread-safe. Since the program
 * consistently prints 500 at runtime
 *
 */
public class Flavors {
	private static int counter;

	public static void countIceCreamFlavors() {
		counter = 0;
		Runnable task = () -> counter++;
		LongStream.range(0, 500).forEach(m -> new Thread(task).run());
		System.out.println(counter);
	}

	public static void main(String[] args) {
		countIceCreamFlavors();
	}
}
