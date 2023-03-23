package certification.tutorials.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class CreateDirectoryExample {

	public static void main(String[] args) throws IOException, ExecutionException {

		Path dir = Paths.get("/tmp/foo");

		Files.createDirectories(dir);

		// We can also create an object of Path by separating parts of the path in
		// Paths.get() method

		Path path = Paths.get("/tmp/file.txt");
		// Path path2= Paths.get("/", "tmp", "file.txt");
		// Path path3= Paths.get("/", "tmp/file.txt");
		Files.createDirectory(path);
		// Files.createDirectory(path2);
		// Files.createDirectory(path3);
	}

}
