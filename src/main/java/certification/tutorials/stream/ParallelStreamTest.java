package certification.tutorials.stream;

import java.util.List;

/**
 * 
 * Based on the reduction operation, the data types of w, y, and z are Integer,
 * while the data type of x is StringBuilder. Since Integer does not define a
 * length() method, both the accumulator and combiner lambda expressions are
 * invalid
 *
 */
public class ParallelStreamTest {

	public static void main(String[] args) {
		var p = List.of(new StringBuilder("hello"), new StringBuilder("goodbye"));
		var q = p.parallelStream().reduce(0, (w, x) -> w.length() + x.length(), (y, z) -> y.length() + z.length());
		System.out.print(q);

	}

}
