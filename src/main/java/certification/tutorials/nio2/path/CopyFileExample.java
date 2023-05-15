package certification.tutorials.path;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/*
 * La copie d'un fichier passe par la méthode Files.copy qui prends en paramètre les Path source et destination de la copie :
 * WARNING:
 * Par défaut, Files.copy génère une exception FileAlreadyExistsException si le Path de destination existe déjà. 
 * Il est cependant possible de demander à remplacer la destination plutôt que de générer une exception dans ce cas là. Pour celà, il faut spécifier
 l'option StandardCopyOption.REPLACE_EXISTING lors de la copie:
 */

public class CopyFileExample {

	@Test
	public void copyFileReplaceIfExists(@TempDir Path someDirectory) throws IOException {

		Path someInputFile = someDirectory.resolve("file.txt");

		Files.createFile(someInputFile);
		assertTrue(Files.exists(someInputFile));

		Path someOutput = Files.createDirectory(someDirectory.resolve("output")).resolve("file2.txt");

		Files.createDirectory(someOutput);
		assertTrue(Files.exists(someOutput));

		try {

			Files.copy(someInputFile, someOutput, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {

			throw new IllegalArgumentException("The directory cannot be created ", e);
		}

		assertTrue(Files.exists(someOutput));

	}

}
