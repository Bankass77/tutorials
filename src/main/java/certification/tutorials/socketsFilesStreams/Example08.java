package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example08 {

	public static void main(String[] args) throws IOException {

		String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";

		Path path = Paths.get(pathString);

		try {
			List<String> fileContent = Files.readAllLines(path);

			// This will go through the buffer containing the whole file
			// and print it line by one to System.out

			for (String content : fileContent) {

				System.out.println(content);
			}
		} catch (Exception e) {
			System.out.println("WARNING : there was an issue with the file.");
		}
	}

}
