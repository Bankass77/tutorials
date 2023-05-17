package certification.tutorials.nio2.path;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * 
 * TIP : Dans cet exemple , le fichier a bien les droits d'écriture puisque
 * ceux-ci ont été donnés au propriétaire du fichier, ie l'utilisateur qui a
 * lancé le programme. En revanche, le fichier n'est pas considéré comme
 * exécutable puisque personne n'a les droits d'exécution.
 *
 * 
 */
public class CreateFilesWithAttributsExample {

	@Test
	public void createWithAttributes(@TempDir Path someDirectory) throws IOException {

		Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-r--r--");

		FileAttribute<Set<PosixFilePermission>> attributes = PosixFilePermissions.asFileAttribute(permissions);
		Path someFile = someDirectory.resolve("file.txt");
		Files.createDirectory(someFile, attributes);
		assertTrue(Files.isReadable(someFile));
		assertTrue(Files.isWritable(someFile));
		assertFalse(Files.isExecutable(someFile));

	}

}
