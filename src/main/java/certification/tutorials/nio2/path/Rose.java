package certification.tutorials.nio2.path;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * Trick question! The code does not compile; The toRealPath() interacts with
 * the file system, and therefore throws a checked IOException. Since this
 * checked exception is not handled inside the lambda expression, the class does
 * not compile. If the lambda expression was fixed to handle the IOException,
 * then the expected number of Path values printed would be six, A maxDepth
 * value of 1 causes the walk() method to visit two total levels—the original
 * /flower and the files it contains.
 *
 */
public class Rose {
	public void tendGarden(Path p) throws Exception {
		Files.walk(p, 1).map(q -> q.toRealPath()).forEach(System.out::println);

	}

	public static void main(String... thorns) throws Exception {
		new Rose().tendGarden(Paths.get(thorns[0]));
	}

}
