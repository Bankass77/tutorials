package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * another way to list the contents of a directory, but this time using
 * java.nio:
 *
 */
public class Example02 {

	public static void main(String[] args) throws IOException {

		String pathString = System.getProperty("java.io.tmpdir");

		List<String> fileNames = new ArrayList<String>();

		// Capture information from the OS
		DirectoryStream<Path> directoryStream;

		directoryStream = Files.newDirectoryStream(Paths.get(pathString));

		for (Path path : directoryStream) {

			fileNames.add(path.toString());
		}

		for (String string : fileNames) {
			System.out.println(string);
		}

	}

}
