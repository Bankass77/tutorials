package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeletingFileTest {

	public static void main(String[] args)  throws IOException{
	
		Files.deleteIfExists(Path.of("/pigeon"));
		Files.delete(Path.of("/vulture/feathers.txt"));

		
	}

}
