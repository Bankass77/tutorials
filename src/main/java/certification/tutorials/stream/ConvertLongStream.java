package certification.tutorials.stream;

import java.util.stream.LongStream;

/**
 * 
 * 
 * The mapToDouble() method compiles. However, it converts 9 into 9.0 rather
 * than the single digit 9. The mapToInt() method does not compile because a
 * long cannot be converted into an int without casting. The mapToLong() method
 * is not available on LongStream so it does not compile. It is available on
 * DoubleStream, IntStream, and Stream implementations. Since none of the
 * options outputs the single digit 9.
 *
 */
public class ConvertLongStream {

	public static void main(String[] args) {

		var stream = LongStream.of(9);

		stream.mapToDouble(p -> p).forEach(System.out::println);
		stream.mapToInt(p -> p).forEach(System.out::println); // The mapToInt() method does not compile because a long
																// cannot be converted into an int without casting
	}

}
