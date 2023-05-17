package certification.tutorials.nio2.path;

import java.nio.file.Paths;

public class SubPathTest {

	public static void main(String[] args) {
		
		
		var p= Paths.get("/mammals/omnivore/raccoon.image");
		
		System.out.println("Path is: " +p );
		
		for (int i = 0; i < p.getNameCount(); i++) {
			
			System.out.println( " Element " + i +  " is : " + p.getName(i));
		}
		System.out.println();
		System.out.println("p.subpath(0, 3):" + p.subpath(0, 3));
		System.out.println("p.subpath(1, 2): " + p.subpath(1, 2));
		System.out.println("p.subpath(1, 3): "+ p.subpath(1, 3));
		
		var q= p.subpath(0, 4); // IllegalArgumentException
		System.out.println("x: " + q);
		var x=p.subpath(1, 1); // IllegalArgumentException
		System.out.println("x: "+ x);
		

	}

}
