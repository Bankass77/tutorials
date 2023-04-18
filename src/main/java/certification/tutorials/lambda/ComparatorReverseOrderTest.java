package certification.tutorials.lambda;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 
 * The sorted() method allows an optional Comparator to be passed as a
 * reference. However, Comparator.reverseOrder() does not implement the
 * Comparator interface. It takes zero parameters instead of the required two.
 * Since it cannot be used as a method reference, the code does not compile,
 *
 */
public class ComparatorReverseOrderTest {

	public static void main(String[] args) {
		var s = Stream.of("over the river", "through the woods", "to grandmother's house we go");

		s.filter(n -> n.startsWith("t")).sorted(Comparator::reverseOrder).findFirst().ifPresent(System.out::println);

	}

}
