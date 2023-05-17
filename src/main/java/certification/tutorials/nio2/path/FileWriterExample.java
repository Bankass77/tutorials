package certification.tutorials.nio2.path;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileWriterExample {

	public static void main(String[] args) {

		Charset charset = StandardCharsets.UTF_8;

		try (FileWriter fileWriter = new FileWriter("demo.txt", charset)) {

			fileWriter.write("Hello, world!\n");

			fileWriter.write("Learn how to write data to a filer using FileWriter\n");

		} catch (IOException e) {
			System.out.format("IO error: %s%n", e);
			throw new IllegalArgumentException(e);

		}

	}

}
