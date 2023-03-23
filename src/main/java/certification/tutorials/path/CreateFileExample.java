package certification.tutorials.path;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/*
 * Créer un fichier est aussi simple que créer un répertoire avec la méthode java.nio.Files.createFile.
 *  Là encore, la méthode renvoie une exception si le fichier existe déjà.
 */
public class CreateFileExample {

	@Test
	public void createFile(@TempDir Path someDirectory) {

		final String fileName = "file.txt";

		Path someFile = someDirectory.resolve(fileName);
		assertFalse(Files.exists(someFile));

		try {

			Files.createFile(someFile);
		} catch (FileAlreadyExistsException e) {
			throw new IllegalArgumentException("The File already exists", e);

		} catch (IOException e) {
			throw new IllegalArgumentException("The File cannot be created ", e);
		}

		assertTrue(Files.exists(someFile));
	}

}
