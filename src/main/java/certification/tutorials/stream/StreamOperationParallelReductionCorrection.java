package certification.tutorials.stream;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationParallelReductionCorrection {
	public static void main(String[] args) {
		var r = new Random();
		var data = Stream.generate(() -> String.valueOf(r.nextInt())).limit(50_000_000).collect(Collectors.toSet());
		var map = data.parallelStream().collect(Collectors.groupingByConcurrent(String::length));
	}

}
