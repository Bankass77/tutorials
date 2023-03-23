package certification.tutorials.predicateConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredictateExercice {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Chris", "'HTML", "XML", "CSS");
		Stream<String> stream = names.stream();

		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> notEmpty = isEmpty.negate();

		//System.out.println(stream.filter(isEmpty).collect(Collectors.toList()));
		System.out.println("-------------------------------");
		System.out.println(stream.filter(notEmpty).collect(Collectors.toList()));

	}

}
