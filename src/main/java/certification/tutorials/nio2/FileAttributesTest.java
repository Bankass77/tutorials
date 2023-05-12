package certification.tutorials.nio2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileAttributesTest {

	public static void main(String[] args) {

		System.out.println(Files.isDirectory(Paths.get("/canine/fur.jpg")));
		System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));
		System.out.println(Files.isRegularFile(Paths.get("/canine/types.txt")));

	}

}
