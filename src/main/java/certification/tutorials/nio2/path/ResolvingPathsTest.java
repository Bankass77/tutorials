package certification.tutorials.nio2.path;

import java.nio.file.Path;

public class ResolvingPathsTest {

	public static void main(String[] args) {
		
		//Let’s see what happens if we apply resolve() to an absolute path and a relative path
		Path path1= Path.of("/cats/../panther");
		
		Path path2= Path.of("food");
		System.out.println(path1.resolve(path2));
		
		System.out.println();
		
		//but what if it had been an relative path?
		Path path3= Path.of("document/file.txt");
		System.out.println(path2.resolve(path3));
		
		
		System.out.println();
		//but what if it had been an absolute path?
		
		Path path4= Path.of("/turkey/food");
		
		System.out.println(path3.resolve("/tiger/cage"));
	}

}
