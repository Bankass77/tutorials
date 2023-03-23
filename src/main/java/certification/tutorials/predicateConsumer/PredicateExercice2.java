package certification.tutorials.predicateConsumer;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateExercice2 {

	public static void main(String[] args) {
		
		
		Predicate<String> isEmpty = String::isEmpty;

		Predicate<String> notEmpty = isEmpty.negate();

		var result = Stream.generate(() -> "").filter(notEmpty).collect(Collectors.groupingBy(k -> k)).entrySet()
				.stream().map(Entry::getValue).flatMap(Collection::stream)
				.collect(Collectors.partitioningBy(notEmpty));
		System.out.println("result : "+ result);

	}

}
