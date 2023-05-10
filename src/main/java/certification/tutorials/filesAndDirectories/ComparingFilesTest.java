package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ComparingFilesTest {

	public static void main(String[] args) throws IOException {
		Files.createSymbolicLink(Path.of("/home/animals/snake"), Path.of("/home/animals/cobra"));
		//Files.createDirectories(Path.of("/home/animals/cobra"));
		//Files.createDirectories(Path.of("/home/animals/snake"));
		Files.createDirectories(Path.of("/home/animals/monkey"));
		Files.createDirectories(Path.of("/home/animals/wolf"));
		//Files.createFile(Path.of("/home/animals/wolf/ears.png"));
		//Files.createFile(Path.of("/home/animals/monkey/tail.gif"));
		//Files.createFile(Path.of("/home/animals/monkey/ears.png"));
		
		Files.readSymbolicLink(Path.of("/home/animals/snake"));
		System.out.println(Files.isSameFile(Path.of("/home/animals/snake"), Path.of("/home/animals/cobra")));
		System.out.println(Files.isSameFile(Path.of("/home/animals/monkey/ears.png"), Path.of("/home/animals/wolf/ears.png")));
	

		System.out.println(Files.mismatch(Path.of("/home/animals/wolf.txt"), Path.of("/home/animals/monkey.txt")));
	}

}
