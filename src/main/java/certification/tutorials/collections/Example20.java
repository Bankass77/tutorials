package certification.tutorials.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example20 {

	public static void main(String[] args) {

		Properties pop = new Properties();
		Set setOfKeys;

		String key;
		pop.put("OS", "Ubuntu Linux");
		pop.put("version", "20.04");
		pop.put("language", "English (UK)");

		// Iterate though the map

		setOfKeys = pop.keySet();
		Iterator iterator = setOfKeys.iterator();

		while (iterator.hasNext()) {
			key = (String) iterator.next();
			System.out.println(key + " = " + pop.getProperty(key));

		}
		System.out.println();
		// looking for URL that not in list

		String value = pop.getProperty("Keyboard layout", "not found");
		System.out.println("keyboard layout= " + value);

	}

}
