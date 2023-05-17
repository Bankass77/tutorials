package certification.tutorials.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class BufferedReaderExemple {

	public static Map<String, Long> wordCount(BufferedReader reader) throws IOException {

		return reader.lines().flatMap(line -> Arrays.stream(line.split(" ")))
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
	}

	public static void main(String[] args) throws IOException {

		var path = Paths.get("/opt/maven/apache-maven-3.9.0/README.txt");

		try (var reader = Files.newBufferedReader(path)) {

			System.out.println(wordCount(reader));
		}
	}

}
