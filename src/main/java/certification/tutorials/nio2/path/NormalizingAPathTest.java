package certification.tutorials.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizingAPathTest {

	public static void main(String[] args) {
	
		var p1= Path.of("./armadillo/../shells.txt");
		System.out.println(p1.normalize()); // shells.txt
		
		var p2= Path.of("/cats/../panther/food");
		System.out.println(p2.normalize()); // pathre/food
		
		var p3= Path.of("../../fish.txt");
		System.out.println(p3.normalize());  //..//../fish.txt
		
		
		// compare two Paths with normalize() method
		
		var p4= Paths.get("/pony/../weather.txt");
		var p5= Paths.get("/weather.txt");
		System.out.println(p4.normalize());
		System.out.println(p5.normalize());
		System.out.println("------------compare two Paths with normalize() method----------------------");
		System.out.println(p4.normalize().equals(p5));// false
		
		System.out.println(p4.normalize().equals(p5.normalize())); // true
		

	}

}
