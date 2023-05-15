package certification.tutorials.path;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindFilewNewDirectoryStreamExample {

	public static void main(String[] args) throws IOException {

		try (DirectoryStream<Path> path = Files.newDirectoryStream(Paths.get("/opt/"))) {

			for (Path path2 : path) {
				System.out.println(path2.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			System.err.println(e);
		}
	}

}
