package certification.tutorials.nio2.path;

import static org.junit.Assert.assertTrue;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * resolve: combiner des Path La méthode resolve permet de combiner un Path à un
 * autre, à condition que ce dernier soit relatif. Si ce n'est pas le cas, le
 * Path donné en paramètre à la méthode resolve est retourné.
 *
 */
public class PathTestResolveExample {

	@Test
	public void resolveTest() {

		Path someDirectory = Paths.get("/tmp");

		Path someFile = someDirectory.resolve("subdirectory").resolve("file.txt");

		assert (someDirectory.toString()).equals("/tmp/subdirectory/file.txt");
		assert (someFile.getParent().toString()).equals("/tmp/subdirectory");
		assert (someFile.getFileName().toString()).equals("file.txt");

		assertTrue(someFile.isAbsolute());
		assertTrue(someFile.startsWith("/tmp"));
		assertTrue(someFile.endsWith("file.txt"));
		assertTrue(someFile.startsWith(Paths.get("/tmp")));
		assertTrue(someFile.endsWith(Paths.get("file.txt")));

	}
}
