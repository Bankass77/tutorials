package certification.tutorials.path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedWriteExample {

	public static void main(String[] args) throws IOException {

		Path filePath = Paths.get("demo.txt");
		Charset charset = StandardCharsets.UTF_8;

		// Instantiate a BufferedWriter

		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, charset)) {

			// Write data

			bufferedWriter.write("Hello, World");

			bufferedWriter.newLine();
			bufferedWriter.write("Learn how to write data to a file efficiently using BufferedWritter ");
			bufferedWriter.newLine();
		} catch (IOException e) {

			System.out.format("I/O error:%s%n", e);
		}
	}

}
