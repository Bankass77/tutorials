package certification.tutorials.nio2.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindFilesWalkExample {

	public static void main(String[] args) throws IOException {

		try (Stream<Path> paths = Files.walk(Paths.get("/tmp/"))) {

			paths.filter(Files::isRegularFile).forEach(System.out::println);

		}

	}

}
