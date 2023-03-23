package certification.tutorials.checkTest;

import java.util.TreeMap;

public class TestMapTree {

	public static void main(String[] args) {

		var treepMap = new TreeMap<Character, Integer>();
		treepMap.put('K', 1);
		treepMap.put('K', 2);
		treepMap.put('m', 3);
		treepMap.put('M', 4);

		treepMap.replaceAll((k, v) -> v + v);
		treepMap.keySet().forEach(k -> System.out.println(treepMap.get(k)));

	}

}
