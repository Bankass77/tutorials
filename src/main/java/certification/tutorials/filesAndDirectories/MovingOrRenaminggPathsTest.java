package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MovingOrRenaminggPathsTest {

	public static void main(String[] args) throws IOException {

		Files.move(Path.of("C:\\zoo"), Path.of("C:\\zoo-new"));

		Files.move(Path.of("C:\\user\\addresses.txt"), Path.of("C:\\zoo-new\\addresses.txt"));
	
		Files.move(Path.of("mouse.txt"), Path.of("gerbil.txt"), StandardCopyOption.ATOMIC_MOVE);
		

	}

}
