package certification.tutorials.nio2.path;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * La méthode java.nio.Files.createDirectory permet de créer simplement le répertoire qui correspond à un Path donné:
 * WARNING
 * La méthode java.nio.Files.createDirectory renvoie une exception FileAlreadyExistsException si le Path donné existe déjà. 
 * Pour créer un répertoire seulement s'il n'existe pas, 
 * il n'y a pas de méthode dédiée. Une solution consiste donc à tester l'existance du répertoire avant de le créer.
 *
 */
public class CreaetDirectoryExample {

	@Test
	public void createDirectory(@TempDir Path someDirectory) {
		final String subdirectoryName = "subdirectory";

		Path someSubdirectory = someDirectory.resolve(subdirectoryName);

		assertFalse(Files.exists(someSubdirectory));

		try {

			Files.createDirectory(someSubdirectory);
		} catch (FileAlreadyExistsException e) {
			throw new IllegalArgumentException("The Directory already exists", e);
		} catch (IOException e) {
			throw new IllegalArgumentException("The Directory cannot be created", e);

		}

		assertTrue(Files.exists(someSubdirectory));
	}

}
