package certification.tutorials.filesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class CopyTest {

	/**
	 * @param source
	 * @param target
	 */
	public void copyPath(Path source, Path target) {

		try {
			Files.copy(source, target);
			if (Files.isDirectory(source)) {

				try {
					Stream<Path> s = Files.list(source);
					s.close();
					s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
				} catch (IOException e) {

				}

			}
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws IOException {

		CopyTest copyTest = new CopyTest();
		copyTest.copyPath(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));

		Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));

		Files.copy(Paths.get("/turtle"), Paths.get("/turtleCopy"));
		
		Files.copy(Paths.get("/turtle"), Paths.get("/turtleCopy"), StandardCopyOption.REPLACE_EXISTING);
		
		

	}

}
