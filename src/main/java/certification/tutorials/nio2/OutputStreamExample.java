package certification.tutorials.nio2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.StandardOpenOption;

public class OutputStreamExample {

	public static void main(String[] args) {
		Path path = Path.of("/home/out.txt");

		try (OutputStream os = Files.newOutputStream(path, StandardOpenOption.CREATE)) {
			// Ecriture des données dans le fichier à l'aide de l'OutputStream
			String data = "Hello World";
			byte[] bytes = data.getBytes();
			os.write(bytes);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
