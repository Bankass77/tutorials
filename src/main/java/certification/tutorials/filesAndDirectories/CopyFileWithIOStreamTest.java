package certification.tutorials.filesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFileWithIOStreamTest {

	public static void main(String[] args) throws IOException {

		try (var is = new FileInputStream("lorumsum.txt")) {

			// Write I/O stream data to a file
			Files.copy(is, Paths.get("/mammals/wolf.txt"));

		}
		Files.copy(Paths.get("/fisg/clown.xls"), System.out);

	}

}
