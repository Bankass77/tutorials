package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
	
		
		Path path = Paths.get("/opt");
		try( Stream<Path> stream= Files.list(path )) {
		
			stream.forEach(System.out::println);
		
		} catch (IOException e) {
		e.printStackTrace();
		}

	}

}
