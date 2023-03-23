package certification.tutorials.collections;

import java.util.Enumeration;
import java.util.Properties;

public class Exemple22 {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.put("Os", "Ubuntu Linux");
		properties.put("version", "20.04");
		properties.put("language", "English (UK)");

		String key;

		Enumeration enumeration = properties.propertyNames();

		while (enumeration.hasMoreElements()) {

			key = (String) enumeration.nextElement();
			System.out.println(key);

		}

	}

}
