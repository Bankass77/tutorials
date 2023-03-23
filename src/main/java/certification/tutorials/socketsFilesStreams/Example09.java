package certification.tutorials.socketsFilesStreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example09 {

	public static void main(String[] args) {

		String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
		Path pathFile = Paths.get(pathString);

		try {
			Files.lines(pathFile).forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("WARNING : there was an issue with the file.");
		}

	}

}
