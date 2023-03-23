package certification.tutorials.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableCollectionExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		// put key-value Pairs in the Map

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		// Obtain an unmodifiable collection
		map = Collections.unmodifiableMap(map);

		System.out.println("map value are: " + map);

		// or

		Map<String, Integer> map2 = Collections.unmodifiableMap(

				new HashMap<String, Integer>() {
					{
						put("one", 1);

						put("two", 2);
						put("three", 3);
					}
				}

		);

		System.out.println("map2 value are : " + map2);

	}

}
