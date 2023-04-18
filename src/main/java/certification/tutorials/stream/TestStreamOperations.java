package certification.tutorials.stream;

import java.util.List;

/**
 * 
 * While the second and third stream operations compile, the first does not. The
 * parallel() method should be applied to a stream, while the parallelStream()
 * method should be applied to a Collection˂E˃.Note that calling parallel() on
 * an already parallel stream is unnecessary but allowed. Finally, the output of
 * the
 *
 */
public class TestStreamOperations {

	public static void main(String[] args) {
		List.of(2, 4, 6, 8).parallel().parallelStream().forEach(System.out::print);

		List.of(2, 4, 6, 8).parallelStream().parallel().forEach(System.out::print);

		List.of(2, 4, 6, 8).parallelStream().parallel().parallel().parallel().forEach(System.out::print);
	}

}
