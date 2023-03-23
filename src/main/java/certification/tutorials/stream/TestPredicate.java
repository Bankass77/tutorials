package certification.tutorials.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 
 * 
 * First, this mess of code does compile. While it starts with an infinite
 * stream on line 23, it becomes finite on line 24 thanks to limit(), making
 * option F incorrect. The pipeline preserves only nonempty elements on line 25.
 * Since there aren't any of those, the pipeline is empty. Line 26 converts this
 * to an empty map. Lines 27 and 28 create a Set with no elements and then
 * another empty stream. Lines 29 and 30 convert the generic type of the Stream
 * to List˂String˃ and then String. Finally, line 31 gives us another
 * Map˂Boolean, List˂String˃˃. The partitioningBy() operation always returns a
 * map with two Boolean keys, even if there are no corresponding values.
 * Therefore, option B is correct if the code is kept as is. By contrast,
 * groupingBy() returns only keys that are actually needed, making option C
 * correct if the code is modified on line 31.
 *
 */

public class TestPredicate {

	public static void main(String[] args) {
		Predicate<String> empty = String::isEmpty;

		Predicate<String> notEmpty = empty.negate();

		var result = Stream.generate(() -> "").limit(10).filter(notEmpty).collect(Collectors.groupingBy(k -> k))
				.entrySet().stream()
				// .map(Entry::getValue).flatMap(Collection::stream).collect(Collectors.partitioningBy(notEmpty));
				.map(Entry::getValue).flatMap(Collection::stream).collect(Collectors.groupingBy(n -> n));
		System.out.println(result);
		// List<?> q = List.of("mouse", "parrot");
		// q.removeIf(String::isEmpty);
		// q.removeIf(s->s.length()==4);
		// var v = List.of("mouse", "parrot");
		// v.removeIf(String::isEmpty);

		var stream = Stream.of("base", "ball");
		stream.map(s -> s.length()).forEach(System.out::print);

	}

}
