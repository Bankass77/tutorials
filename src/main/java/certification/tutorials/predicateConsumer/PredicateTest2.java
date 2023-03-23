package certification.tutorials.predicateConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest2 {

	public static void main(String[] args) {

		List<String> input = Arrays.asList("A", "B", null, "", "C", "D", null, "", "E", " ");

		// Remove null only

		System.out.println("---------remove null values------------");

		List<String> filtered = input.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("filtered: " + filtered); // [ A, B, C,D, E, ]

		// remove null and empty values (Before Java 11)

		System.out.println("---------remove null, empty values (Before Java 11)------------");

		filtered = input.stream().filter(s -> s != null && !s.isEmpty()).collect(Collectors.toList());

		System.out.println(filtered); // [ A, B, C,D, E, ]

		System.out.println("---------remove null, empty and blank values (After Java 11)------------");
		filtered = input.stream().filter(Objects::nonNull).filter(Predicate.not(String::isEmpty))
				.collect(Collectors.toList());

		System.out.println(filtered); // [ A, B, C,D, E, ]

	}

}
