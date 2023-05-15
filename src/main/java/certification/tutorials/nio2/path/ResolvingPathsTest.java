package certification.tutorials.path;

import java.nio.file.Path;

public class ResolvingPathsTest {

	public static void main(String[] args) {
		
		//Let’s see what happens if we apply resolve() to an absolute path and a relative path
		Path path1= Path.of("/cats/../panther");
		
		Path path2= Path.of("food");
		
		System.out.println(path1.resolve(path2));
		
		//but what if it had been an absolute path?
		
		Path path3= Path.of("/turkey/food");
		
		System.out.println(path3.resolve("/tiger/cage"));
	}

}
