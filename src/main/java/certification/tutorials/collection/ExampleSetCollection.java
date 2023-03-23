package certification.tutorials.collection;

import java.util.Collection;
import java.util.HashSet;

public class ExampleSetCollection {

	public static void main(String[] args) {

		Collection<String> set = new HashSet<>();

		set.add("Wand");
		set.add("");

		set.removeIf(String::isEmpty);// set.removeIf(s->s.isEmpty()); remove any empty String objects from set

		System.out.println(set);

	}

}
