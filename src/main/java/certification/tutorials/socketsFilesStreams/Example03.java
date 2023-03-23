package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * another way to list the contents of a directory, but this time using streams:
 *
 */
public class Example03 {

	public static void main(String[] args) throws IOException {

		String stringPath = System.getProperty("java.io.tmpdir");
		Path path = Paths.get(stringPath);
		Stream<Path> filesNames = Files.list(path).filter(Files::isDirectory);
		filesNames.limit(5).forEach(System.out::println);

		filesNames.limit(5).forEach((item) -> {

			System.out.println(item.toString());
			try {
				Stream<Path> fileName2 = Files.list(item).filter(Files::isDirectory);
				fileName2.forEach(System.out::println);
			} catch (Exception e) {

			}
		});

	}

}
