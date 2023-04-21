package certification.tutorials.collection;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * Lines 20–24 created a map with two key/value pairs. Line 26 does not add to
 * the map, since the key 2 is present. Line 15 adds a third key/value to the
 * map. At this point, the map contains {1=4, 2=8, 3=9}. Line 29 replaces the
 * values with one higher than the key, and the map contains {1=2, 2=3, 3=4}.
 * The stream on lines 31  goes through the map and sorts ascendingly by key.
 * It gets the lowest key from that sort, which is 1. Then it prints the value
 * that goes with that key, which is 2
 *
 */
public class TreeMapTest {

	public static void main(String[] args) {
		var m = new TreeMap<Integer, Integer>();

		m.put(1, 4);
		m.put(2, 8);

		m.putIfAbsent(2, 10);
		m.putIfAbsent(3, 9);

		m.replaceAll((k, v) -> k + 1);
		m.entrySet().stream()
		.sorted(Comparator.comparing(Entry::getValue))
		.limit(1)
		.map(Entry::getValue)
		.forEach(System.out::println);

	}

}
