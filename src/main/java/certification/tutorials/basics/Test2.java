package certification.tutorials.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> data = new ArrayList<Integer>();

		// IntStream.range(0, 100).parallel().forEachOrdered(s->data.add(s));
		// System.out.println(data.size());
		System.out.println("------------remove parallel-------------------");

		IntStream.range(0, 100).forEach(s -> data.add(s));
		System.out.println(data.size());

	}

}
