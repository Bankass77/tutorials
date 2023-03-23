package certification.tutorials.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollection {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");

		for (String string : list) {

			System.out.println(string);

		}

		list.removeIf(s -> s.startsWith("A"));

		System.out.println(list);
	}

}
