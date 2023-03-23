package certification.tutorials.lambda;

import java.util.Arrays;
import java.util.List;

public class ExampleStream {

	static List<Integer> values = Arrays.asList(2, 78, 90);

	public static void main(String[] args) {

		long returnValue = values.stream().reduce(0, (a, b) -> -a + b);

		long value = values.stream().takeWhile(x -> x > 2).reduce(0, (a, b) -> a - b).longValue();

		System.out.println("long value is " + "{" + returnValue + "}");

		System.out.println("second long value with takeWhile is " + "{" + returnValue + "}");
	}

}
