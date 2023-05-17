package certification.tutorials.nio2.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class PathAbsoluteTest {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("/glasses/lens");

		Files.walk(p)
		   .map(z -> z.toAbsolutePath().toString())
		   .filter(s -> s.endsWith(".java"))
		   .collect(Collectors.toList()).forEach(System.out::println);

		Files.find(p,Integer.MAX_VALUE,
		      (w,a) -> w.toAbsolutePath().toString().endsWith(".java"))
		   .collect(Collectors.toList()).forEach(System.out::println);


	}

}
