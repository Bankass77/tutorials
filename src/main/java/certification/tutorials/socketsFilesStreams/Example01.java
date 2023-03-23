package certification.tutorials.socketsFilesStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * 
 * another way to list the contents of a directory, but this time using java.io:
 *
 */
public class Example01 {

	public static void main(String[] args) throws IOException {

		String pathString = System.getProperty("java.io.tmpdir");

		String[] fileNames = new File(pathString).list();

		for (String string : fileNames) {
			System.out.println(string);
		}
	}

}
