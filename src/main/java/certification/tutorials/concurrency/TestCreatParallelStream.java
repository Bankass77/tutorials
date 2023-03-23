package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCreatParallelStream {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1);

		DoubleStream ds = s.mapToDouble(x -> x);
		Stream<Integer> s2 = ds.mapToInt(x -> x);
		var c = new ArrayList<Thread>();
		var s = c.stream();
		var p = s.parallel();

		var is = IntStream.empty();
//System.out.println(is.sum());
		var map = new HashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		map.merge(1, 3, (a, b) -> null);
		map.merge(3, 3, (a, b) -> null);
		System.out.println(map);
		var sb = new StringBuilder();
	}

}
