package certification.tutorials.path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintWriterExample {

	public static void main(String[] args) {

		Path path = Paths.get("demo.txt");

		Charset charset = StandardCharsets.UTF_8;

		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, charset)) {

			// Write formatted data using print writer
			PrintWriter printWriter = new PrintWriter(bufferedWriter);

			printWriter.println("Hello, World");
			printWriter.printf("The value of PI is %d", Math.PI);
			printWriter.print(123456L);
			printWriter.print(true);

		} catch (IOException e) {

			System.out.format("I/O error: %s%n", e);
		}

	}

}
