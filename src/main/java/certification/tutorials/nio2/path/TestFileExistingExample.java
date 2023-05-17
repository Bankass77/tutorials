package certification.tutorials.nio2.path;

import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * 
 * Il est très facile de tester l'existence physique d'un objet Path via la
 * méthode statique java.nio.Files.exists
 *
 */
public class TestFileExistingExample {

	@Test
	public void testDirectoryOrFileExists(@TempDir Path someDirectory) {

		boolean directoryExist = Files.exists(someDirectory);
		assertTrue(directoryExist);
	}

}
