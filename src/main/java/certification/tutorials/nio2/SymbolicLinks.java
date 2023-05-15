package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class SymbolicLinks {

	public static void main(String[] args) {
	
		Path path = Path.of("/etc/localtime");

		try {

			if (Files.isSymbolicLink(path)) {

				Path contents = Files.readSymbolicLink(path);

				Path target = path.toRealPath();

				System.out.println("Link contents: " + contents);
				System.out.println("Link target: " + target);
				var attrs = Files.readAttributes(path, BasicFileAttributes.class);
				System.out.println(attrs);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
