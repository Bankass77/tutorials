package certification.tutorials.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiFunction;

public class Exercice18 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Kristian");
		map.put("family name", "Larssen");
		map.put("address", "Jumping Rd");
		map.put("mobile", "555-12345");
		map.put("pet", "cat");

		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			System.out.println("key=" + entry.getKey());
			System.out.println(",value=" + entry.getValue());

		}

		System.out.println("------------foreach loops---------------------------");

		map.values().forEach(System.out::println);

		System.out.println("------------foreach loops  fotr entrySet--------------------------");

		map.entrySet().forEach(System.out::println);

		System.out.println("--------------Replacing Values---------------");

		Map<Integer, Integer> map2 = new HashMap<>();

		map2.put(1, 2);
		map2.put(2, 4);
		Integer original = map2.replace(2, 10);
		System.out.println(map2);

		System.out.println("------------Putting if Absent-------------------");

		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");

		System.out.println(favorites);

		System.out.println("------------------- Merging Data--------------");

		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);

		System.out.println(favorites);
	}

}
