package certification.tutorials.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathComparingMethod {

	public static void main(String[] args) throws IOException{
		
		var p1= Path.of("/lizard", ".").resolve(Path.of("walking.txt"));
		System.out.println("P1: "+ p1);
		var p2= new File("/lizard/././actions/../walking.txt").toPath();
		System.out.println("P2: "+ p2);
		System.out.println(Files.isSameFile(p1, p2));
		System.out.println(" ");
		System.out.println(p1.equals(p2));
		System.out.println( " ");
		System.out.println(Files.mismatch(p1, p2));
		
		

	}

}
