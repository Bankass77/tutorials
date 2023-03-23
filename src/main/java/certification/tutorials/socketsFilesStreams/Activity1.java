package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class Activity1 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("user.home");

		Files.walkFileTree(path, Collections.emptySet(), 3, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attributes) {
				// get the path to the init directory

				String[] pathArray = path.toString().split("/");
				int depthInit = pathArray.length;
				// get the path to the current folder
				String[] fileArray = dir.toString().split("/");
				int depthCurrent = fileArray.length;

				// write the indents

				for (int i = depthInit; i < depthCurrent; i++) {

					System.out.println("  ");

				}

				// Write the directory name

				System.out.println(fileArray[fileArray.length - 1]);
				return FileVisitResult.CONTINUE;

			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException ex) throws IOException {

				System.out.println("visitFileFailed : " + file);
				return FileVisitResult.CONTINUE;

			}
		});

	}

}
