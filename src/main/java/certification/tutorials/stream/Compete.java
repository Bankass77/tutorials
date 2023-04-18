package certification.tutorials.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 
 * There is not a stream pipeline method called sort(). There is one called
 * sorted(). Since the code does not compile. If sorted()
 * were used, then the output would be 689.
 *
 */
public class Compete {
	public static void main(String[] args) {
		Stream<Integer> is = Stream.of(8, 6, 9);
		Comparator<Integer> c = (a, b) -> a - b;
		is.sort(c).forEach(System.out::print);
		//is.sorted(c).forEach(System.out::print);
	}

}
