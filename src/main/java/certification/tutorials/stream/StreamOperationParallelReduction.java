package certification.tutorials.stream;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * To execute a parallel reduction with the collect() method, the stream or
 * Collector must be unordered, the Collector must be concurrent, and the stream
 * must be parallel. Since an unordered Set is used as the data source, the
 * first property is fulfilled. To be a parallel reduction, though,
 * Collectors.groupingByConcurrent() should be used instead of
 * Collectors.groupingBy(). In addition, parallelStream() should be called on
 * the Set, instead of stream()
 *
 */
public class StreamOperationParallelReduction {

	public static void main(String[] args) {
		var r = new Random();
		var data = Stream.generate(() -> String.valueOf(r.nextInt())).limit(50_000_000).collect(Collectors.toSet());
		var map = data.stream().collect(Collectors.groupingBy(String::length));
	}

}
