package certification.tutorials.path;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 * The code does not compile. There are no createDirectory(),
 * createDirectories(), and delete() methods defined on the Path interface.
 * Instead, the NIO.2 Files class should be used. Since four lines of code do
 * not compile.If the lines were corrected to use the Files class, then the
 * application would print an exception at line k1, as the directory already
 * exists.
 *
 */
public class Resume {
	public void writeResume() throws Exception {
		var f1 = Path.of("/templates/proofs");
		f1.createDirectories();
		var f2 = Path.of("/templates");
		f2.createDirectory(); // k1
		try (var w = Files.newBufferedWriter(Path.of(f2.toString(), "draft.txt"))) {
			w.append("My dream job");
			w.flush();
		}
		f1.delete(f1);
		f2.delete(f2); // k2
	}

}
