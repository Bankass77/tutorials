package certification.tutorials.stream;

import java.util.stream.Stream;

public class StreamOfStreams {

	public static void main(String[] args) {
		var result = Stream.of(getNums(9, 8), getNums(22, 33)).flatMap(x -> x).map((a, b) -> a - b)
				.filter(x -> !x.isEmpty()).get();
		System.out.println(result);

	}

	private static Stream<Integer> getNums(int i, int j) {

		return Stream.of(i, j);
	}

}
