package certification.tutorials.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class ExampleMaps {

	public static void main(String[] args) {

		System.out.println(Map.of("key1", "value1", "key2", "value2"));

		System.out.println(Map.ofEntries(

				Map.entry("key3", "value3"),

				Map.entry("key4", "value4")));

		Map<String, String> map = new HashMap<>();

		map.put("koala", "bamboa");
		map.put("lion", "meat");
		map.put("girafe", "leaf");
		String food = map.get("koala");
		System.out.println("value of koala key is:" + food);

		for (String key : map.keySet()) {

			System.out.println(key + ",");
		}

		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboa");
		map2.put("lion", "meat");
		map2.put("girafe", "leaf");
		String foodTreeMap = map.get("koala");
		System.out.println("value of koala key2 is:" + foodTreeMap);

		for (String key2 : map2.keySet()) {

			System.out.println(key2 + ",");
		}

		System.out.println(map.containsKey("lion"));

		System.out.println(map.containsValue("lion"));
		System.out.println(map.isEmpty());

		System.out.println("-------------------------------------");
		Map<Integer, Character> mapIterate = new HashMap<>();

		mapIterate.put(1, 'a');
		mapIterate.put(2, 'b');
		mapIterate.put(3, 'c');
		System.out.println("--------------display Map Values of key -----------------");
		mapIterate.forEach((k, v) -> System.out.println(v));
		System.out.println("--------------display Map keys of values -----------------");
		mapIterate.forEach((k, v) -> System.out.println(k));

		System.out.println("-------------display Map values------------------------");
		mapIterate.values().forEach(System.out::println);

		System.out.println("-------------display Map entrySet values------------------------");
		mapIterate.entrySet().forEach(System.out::println);

		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");

		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		System.out.println("jenny: " + jenny);
		String tom = favorites.merge("Tom", "Skyride", mapper);

		System.out.println("Tom : " + tom);
		System.out.println("favorites is: " + favorites);

	}

}
