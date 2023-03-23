package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class Exercice01 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(System.getProperty("user.home"));
		Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {

			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attributes) {
				System.out.println(dir.toString());
				return FileVisitResult.CONTINUE;
			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
				System.out.println("VisiFileFailed: " + file);
				return FileVisitResult.CONTINUE;
			}
		});

	}

}
