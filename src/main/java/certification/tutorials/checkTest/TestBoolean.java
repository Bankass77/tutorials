package certification.tutorials.checkTest;

import java.util.function.Function;

public class TestBoolean {

	public static void main(String[] args) {

		System.out.println(test((i) -> i == 5));
	}

	private static boolean test(Function<Integer, Boolean> b) {
		return b.apply(5);
	}
}
