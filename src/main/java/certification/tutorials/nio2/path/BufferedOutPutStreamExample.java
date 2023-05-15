package certification.tutorials.path;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedOutPutStreamExample {

	public static void main(String[] args) {

		String data = " This example shows to write data to a file Using BufferedOutPutStream";

		try (OutputStream outputStream = Files.newOutputStream(Paths.get("demo.txt"))) {

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

			// Write binary data to file

			bufferedOutputStream.write(data.getBytes());

		} catch (IOException e) {

			System.out.format("IO error: %s%n", e);
		}

	}

}
