package certification.tutorials.nio2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedWritterExample {

	public static void main(String[] args) {

		Path path = Path.of("/home/bufferedWriter.txt");

		try (BufferedWriter writter = Files.newBufferedWriter(path, Charset.forName("UTF-8"))) {
			String data = " Hello World in buffered writer file.";
			writter.write(data);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
