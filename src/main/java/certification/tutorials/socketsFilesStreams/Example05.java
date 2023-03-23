package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example05 {

	public static void main(String[] args) throws IOException {

		String stringPath = System.getProperty("user.home");

		List<Path> subDirectories = Files.walk(Paths.get(stringPath), 3).filter(Files::isDirectory)
				.collect(Collectors.toList());

		for (Path path : subDirectories) {

			String filePath = path.toString();

			String fileType = Files.isDirectory(path) ? "Dir" : "Fil";
			System.out.println(fileType + " " + filePath);
		}
	}

}
