package certification.tutorials.nio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeRelativizeTest {

	private void echo() throws IOException {
		var o = new FileWriter("new-­zoo.txt");
		try (var f = new FileReader("zoo-­data.txt"); var b = new BufferedReader(f); o) {
			o.write(b.readLine());
		}
		o.write("");

	}

	public static void main(String[] args) throws IOException  {

		var p1 = Path.of("/zoo/./bear", "../food.txt");

		p1.normalize().relativize(Path.of("/lion"));
		System.out.println(p1);

		var p2 = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(p2.subpath(1, 3).getName(1));

		var p3 = Path.of("/pets/../cat.txt");
		var p4 = Paths.get("./dog.txt");
		System.out.println(p4.resolve(p3));
		
		NormalizeRelativizeTest test= new NormalizeRelativizeTest();
		test.echo();

	}

}
