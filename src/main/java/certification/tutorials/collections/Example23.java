package certification.tutorials.collections;

import java.util.Properties;

public class Example23 {

	public static void main(String[] args) {
		Properties properties = new Properties();

		properties.put("Os", "Ubuntu Linux");
		properties.put("version", "20.04");
		properties.put("language", "English(UK)");

		String oldValue = (String) properties.setProperty("language", "French");

		if (oldValue != null) {

			System.out.println("Modified the language propetrty");
		}

		properties.list(System.out);
	}

}
