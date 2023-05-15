package certification.tutorials.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderExample {

	public static void main(String[] args) {

		Path path = Path.of("/home/out.txt");

		try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
			String line;

			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
