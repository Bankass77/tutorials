package certification.tutorials.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		var halleysComet = Path.of("stars/./rocks/../m1.meteor").subpath(1, 5).normalize();
		System.out.println("halleysComet is:" + halleysComet);
		var lexellsComet = Paths.get("./stars/../solar/");
		lexellsComet.subpath(1, 3).resolve("m1.meteor").normalize();
		System.out.println("lexellsComet is: " + lexellsComet);

		System.out.println(halleysComet.equals(lexellsComet) ? "same!" : "Different!");
		var days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 0; i < days.length; i++)
			System.out.println(days[i]);
	}

}
