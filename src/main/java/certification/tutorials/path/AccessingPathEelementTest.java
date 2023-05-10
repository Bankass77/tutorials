package certification.tutorials.path;

import java.nio.file.Path;

public class AccessingPathEelementTest {

	
	public static void printPathInformation( Path path) {
		
		System.out.println("FileName is : " + path.getFileName());
		System.out.println("  Root is: " + path.getRoot());
		Path currentParent= path;
		while ((currentParent= currentParent.getParent()) !=null) {
			
			System.out.println( " current parent is: " + currentParent);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		
		printPathInformation(Path.of("zoo"));
		printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
		printPathInformation(Path.of("./armadillo/../shells.txt"));

	}

}
