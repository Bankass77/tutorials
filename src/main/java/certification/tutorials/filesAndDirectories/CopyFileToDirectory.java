package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFileToDirectory {

	public static void main(String[] args) throws IOException {
		
		var file= Paths.get("food.txt");
		var directory= Paths.get("/eclosured/food.txt");
		Files.copy(file, directory);

	}

}
