package certification.tutorials.nio2;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WalkingADirectoryTest {

	/**
	 * @param path
	 * @return the files size, walk a directory tree and return the total size
	 * 
	 * 
	 */
	private long getSize(Path path) {

		try {
			return Files.size(path);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	public long getPathSize(Path source) throws IOException {

		try (var s = Files.walk(source)) {
			return s.parallel().filter(p -> !Files.isDirectory(p)).mapToLong(this::getSize).sum();
		}

	}

	public static void main(String[] args) throws IOException {
		WalkingADirectoryTest walkingADirectoryTest = new WalkingADirectoryTest();

		var size = walkingADirectoryTest.getPathSize(Path.of("/home/eclipse-workspace/tutorials"));
		System.out.printf("Total Size : 2%f megabytes", size / 1000000.0);

	}

}
