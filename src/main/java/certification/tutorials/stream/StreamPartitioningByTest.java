package certification.tutorials.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * The code tries to use the same stream twice. This is not allowed, and it
 * throws an exception that the stream has already been operated on or closed.
 *
 */
public class StreamPartitioningByTest {

	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		var p = s.collect(Collectors.partitioningBy(b -> b.startsWith("c")));
		var g = s.collect(Collectors.groupingBy(b -> b.startsWith("c")));
		System.out.println(p + " " + g);

	}

}
