package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListExemple {

	public static void main(String[] args) {

		Path path = Path.of("/opt");

		try (Stream<Path> stream = Files.list(path)) {

			stream.forEach(entry -> System.out.println(entry.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
