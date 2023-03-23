package certification.tutorials.path;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 
 * Listing a File system's Root Directories
 *
 */
public class DirectoryExample {

	public static void main(String[] args) {

		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();

		for (Path path : dirs) {

			System.err.println(path);
		}

	}

}
