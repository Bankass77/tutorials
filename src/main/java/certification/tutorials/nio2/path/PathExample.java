package certification.tutorials.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
	
	public static void main(String[] args) {
		
		
		Path absolutePath= Paths.get("/home/user");
		Path relativePath= Paths.get("documents/file.txt");
		
		Path absoluteResolvedPath= absolutePath.resolve(relativePath).normalize();
		System.out.println("absoluteResolvedPath :"+ absoluteResolvedPath);
		
		Path relativeResolvedPath= relativePath.toAbsolutePath().normalize();
		System.out.println("relativeResolvedPath "+ relativeResolvedPath);
		
		Path relativePathFromAbsolute= absolutePath.relativize(absoluteResolvedPath);
		System.out.println("relativePathFromAbsolute: " + relativePathFromAbsolute);
		
		
	
	}

}
