package certification.tutorials.stream;

import java.util.stream.IntStream;

/**
 * 
 * Even though a parallel stream is used, the forEachOrdered() method forces the
 * stream to operate in the order of its data source. The code compiles and runs
 * without issue, printing 12345 every time
 *
 */
public class Bull {
	void charge() {
		IntStream.range(1, 6).parallel().forEachOrdered(System.out::print);
	}

	public static void main(String[] args) {
		var b = new Bull();
		b.charge();
	}

}
