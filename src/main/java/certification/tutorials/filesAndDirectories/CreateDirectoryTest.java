package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectoryTest {

	public static void main(String[] args)  throws IOException{
		
		Files.createDirectory(Path.of("/home/bison/field"));
		
		Files.createDirectories(Path.of("/home/bison/field/pasture/green"));
		

	}

}
