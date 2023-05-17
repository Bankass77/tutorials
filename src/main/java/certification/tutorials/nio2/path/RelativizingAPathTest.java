package certification.tutorials.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizingAPathTest {

	public static void main(String[] args) {

		
		var p1= Path.of("/zoo/./bear", "../food.txt");
		p1.normalize().relativize(Path.of("/lion"));
		//System.out.println(p1.normalize().relativize(Path.of("/lion")));
		System.out.println("p1: " + " "+p1);
		
		System.out.println();
		System.out.println("------two relative paths-------------");
		System.out.println();
		var path1 = Path.of("fish.txt");
		var path2 = Path.of("friendly/birds.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		System.out.println();
		System.out.println("------two absolute paths-------------");
		System.out.println();
		Path path3 = Paths.get("//://habitat");
		Path path4 = Paths.get("//://sanctuary//raven//poe.txt");
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));
		System.out.println("----------Mixed  relative and absolute paths throws an IllegalArgumentException----------");
		
		Path path5= Paths.get("/primate/chimpanzee");
		Path path6= Paths.get("bananas.txt");
		System.out.println(path5.relativize(path6));// IllegalArgumentException
		
		
		
	}

}
