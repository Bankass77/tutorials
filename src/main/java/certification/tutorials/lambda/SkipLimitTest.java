package certification.tutorials.lambda;

import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * The stream operations on lines 21–22 reduce the stream to the values [2, 3,
 * 4]. Line 23 then converts the Stream<Integer>to an IntStream. On line 24,
 * the first element of the IntStream is skipped, so the stream has only two
 * elements [3, 4]. On line 25-26, the IntStream is converted to a
 * Stream<Integer>, then a DoubleStream. Finally, on lines 27-28 the sum of the
 * remaining elements is calculated and printed. Since 7.0 is printed
 *
 */
public class SkipLimitTest {

	public static void main(String[] args) {
		var pears = List.of(1, 2, 3, 4, 5, 6);
		final var sum = pears.stream()
				.skip(1)
				.limit(3)
				.flatMapToInt(s -> IntStream.of(s))
				.skip(1)
				.boxed()
				.mapToDouble(s -> s)
				.sum();
		System.out.println(sum);
	}
}
