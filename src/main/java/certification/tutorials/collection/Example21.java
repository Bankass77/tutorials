package certification.tutorials.collection;

import java.util.Properties;

public class Example21 {

	public static void main(String[] args) {

		Properties properties = new Properties();

		properties.put("Os", "Ubuntu");
		properties.put("version", "20.04");
		properties.put("language", "English (UK)");
		properties.list(System.out);

	}

}
