package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class RetrievingAttributesTest {

	public static void main(String[] args) throws IOException {
		var path = Paths.get("/home/lorumsum.txt");

		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("is a Directory : " + data.isDirectory());
		System.out.println("Is a regular File ? " + data.isRegularFile());

		System.out.println("Is a symbolic link ? " + data.isSymbolicLink());
		System.out.println("data sire (in bytes) : "+ data.size());
		System.out.println("last Modified: "+ data.lastModifiedTime());

	}

}
