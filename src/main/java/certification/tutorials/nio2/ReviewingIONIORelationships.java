package certification.tutorials.nio2;


import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReviewingIONIORelationships {

	public static void main(String[] args) {
	
		
		Path path = FileSystems.getDefault().getPath("/home");
		System.out.println(path);
		
		FileSystem fileSystem= path.getFileSystem();
		System.out.println(fileSystem);
		
		Path path2= Paths.get("/data.txt");
		System.out.println(path2);
		
		File file= path.toFile();
		System.out.println(file);
		URI uri= path.toUri();
		System.out.println(uri);
		
		System.out.println(Files.isReadable(path2));
		
	}

}
