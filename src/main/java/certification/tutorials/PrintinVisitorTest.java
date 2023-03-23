package certification.tutorials;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintinVisitorTest {

	public static void main(String[] args) throws IOException {

		for (String string : args) {

			Path path = Paths.get(string);

			visitRecursively(path);

		}

	}

	private static void visitRecursively(Path path) throws IOException {

		printFileVisitor printFileVisitor = new PrintFileVisitor();
		Files.walkFileTree(path, printFileVisitor);
		printFileVisitor.printSummary();

	}

}
