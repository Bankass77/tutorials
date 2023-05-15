package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorExample {

	public static void main(String[] args) {

		Path pathStart = Path.of("/opt");

		try {

			Files.walkFileTree(pathStart, new FileVisitor<Path>() {

				@Override
				public FileVisitResult postVisitDirectory(Path arg0, IOException arg1) throws IOException {
					
					System.out.println( "postVisite File: " + " "+arg0.getFileName());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult preVisitDirectory(Path arg0, BasicFileAttributes arg1) throws IOException {
					System.out.println( "preVisite File: " + " "+arg0.getFileName());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path arg0, BasicFileAttributes arg1) throws IOException {

					System.out.println( "Visite File: " + " "+arg0.getFileName());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path arg0, IOException arg1) throws IOException {
					System.out.println( "Visite File Failed: " + " "+arg0.getFileName());
					return FileVisitResult.CONTINUE;
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
