package certification.tutorials.socketsFilesStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example10 {

	public static void printOutProperties(FileInputStream fileInputStream) throws IOException {

		Properties properties = new Properties();

		properties.load(fileInputStream);

		System.out.println("name: " + properties.getProperty("name"));
		System.out.println("family name: " + properties.getProperty("familyName"));
		System.out.println("age :" + properties.getProperty("userName"));
		System.out.println("background color: " + properties.getProperty("bgColor"));
	}

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = null;

		String stringPath = System.getProperty("user.home") + "/javaTemp/user.properties";
		try {

			fileInputStream = new FileInputStream(stringPath);
			printOutProperties(fileInputStream);
		} catch (FileNotFoundException e) {
			System.out.println("WARNING : could not find the properties file");
		} catch (Exception e) {

			System.out.println("WARNING: problem processing the properties file.");
		} finally {
			if (fileInputStream != null) {

				fileInputStream.close();
			}
		}

	}

}
