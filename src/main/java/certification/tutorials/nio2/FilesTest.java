package certification.tutorials.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTest {

	public static void main(String[] args) throws IOException {
	
		var p1 = Path.of("/lizard",".").resolve(Path.of("walking.txt"));
		System.out.println("p1: " + p1);
		var p2 = new File("/lizard/././actions/../walking.txt").toPath();
		System.out.println("p2: " + p2);
		System.out.print(Files.isSameFile(p1,p2));
		System.out.print(" ");
		System.out.print(p1.equals(p2));
		System.out.print(" ");
		System.out.print(Files.mismatch(p1,p2));

		Files.move(Path.of("monkey.txt"), Paths.get("/animals"),
				StandardCopyOption.ATOMIC_MOVE,
				LinkOption.NOFOLLOW_LINKS);
	}

}
