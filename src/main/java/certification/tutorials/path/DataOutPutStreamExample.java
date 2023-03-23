package certification.tutorials.path;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataOutPutStreamExample {

	public static void main(String[] args) {

		try (OutputStream outputStream = Files.newOutputStream(Paths.get("demo.txt"))) {

			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

			dataOutputStream.writeUTF("Hello");
			dataOutputStream.writeLong(Long.MAX_VALUE);
			dataOutputStream.writeDouble(Math.PI);
			dataOutputStream.writeBoolean(true);

		} catch (IOException e) {
			System.out.format("IO error: %s%n", e);
		}
	}

}
