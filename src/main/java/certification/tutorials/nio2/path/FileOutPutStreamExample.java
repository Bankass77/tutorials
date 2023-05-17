package certification.tutorials.nio2.path;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {

	public static void main(String[] args) {

		String data = "This example shows how to write data to a file using FileOutPutStream";

		try (FileOutputStream fileOutputStream = new FileOutputStream("demo.txt")) {

			fileOutputStream.write(data.getBytes());

		} catch (IOException e) {
			System.out.format("IO error: %s%n", e);
		}

	}

}
