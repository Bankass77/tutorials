package certification.tutorials.nio2.path;

import java.io.File;
import java.nio.file.Path;

public class ConvertFileToPath {

	public static void main(String[] args) {
		
		
		File file= new File("/tmp/file.txt");
		
		Path path = file.toPath();
		
		System.out.println(path);

	}

}
