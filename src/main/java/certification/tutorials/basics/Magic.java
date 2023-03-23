package certification.tutorials.basics;

import java.util.Optional;
import java.util.stream.Stream;

public class Magic {

	private static void magic(Stream<Integer> s) {

		Optional<Integer> o = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
		System.out.println(o.get());
	}

	public static void main(String[] args) {

		// magic(Stream.empty());
		System.out.println("----------------------");
		magic(Stream.iterate(1, x -> x++));

		System.out.println("----------------------");

		// magic(Stream.of(5,10));
	}

}
