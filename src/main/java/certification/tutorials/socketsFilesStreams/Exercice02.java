package certification.tutorials.socketsFilesStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Enumeration;
import java.util.Properties;

public class Exercice02 {

	private static Properties loadProperties(String pathString) throws IOException {

		Properties properties = new Properties();

		FileInputStream fis = null;

		try {

			fis = new FileInputStream(pathString);

			properties.load(fis);

		} catch (FileNotFoundException e) {

			System.out.println("WARNING: properties file not found");
		} catch (IOException e) {

			System.out.println("Error: problem processing the properties file.");
		} finally {

			if (fis != null) {
				fis.close();
			}
		}
		return properties;

	}

	private static void printOutProperties(Properties properties) {

		Enumeration keys = properties.keys();

		for (int i = 0; i < properties.size(); i++) {

			String key = keys.nextElement().toString();
			System.out.println(key + ": " + properties.getProperty(key));
		}
	}

	private static void writeProperties(String pathString, Properties properties) throws IOException {

		FileOutputStream fileOutputStream = null;

		try {

			fileOutputStream = new FileOutputStream(pathString);

			// Write the resulting properties object back to the file adds as comment the
			// tempstamp to the latest modification made
			properties.store(fileOutputStream, "# modified on: " + LocalDate.now());
		} catch (FileNotFoundException e) {
			System.out.println("WARNING : could not find the properties file");
		} catch (IOException e) {
			System.out.println("WARNINg : problemm processing the properties file.");
		} finally {
			if (fileOutputStream != null) {

				fileOutputStream.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {

		String pathString = System.getProperty("user.home") + "/javaTemp/" + args[0];

		Path pathFile = Paths.get(pathString);

		// Create the properties object
		Properties properties = new Properties();

		// If the properties file exists, load the file into the properties object
		if (Files.exists(pathFile)) {

			properties = loadProperties(pathString);
			System.out.println("WARNING: file exist already at: " + pathFile);
		}

		// iterate through the rest of the arguments and add them to the properties
		// object
		for (int i = 0; i < args.length; i++) {
			String[] keyValue = args[i].split("=");
			properties.setProperty(keyValue[0], keyValue[1]);
		}

		try {
			writeProperties(pathString, properties);
		} catch (Exception e) {
			System.out.println("Warning: problem while closing properties file.");
		}

		// print the final result to System.out
		printOutProperties(properties);

	}

}
