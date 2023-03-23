package certification.tutorials.path;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/**
 * 
 * normalize: nettoyer un Path Enfin la méthode normalize permet de simplifier
 * un Path donné en éliminant les éléments de type . et ...
 *
 */
public class NormalizeExample {

	@Test
	public void normalize() {

		Path someDir = Paths.get("/tmp", "dir", "..", "otherDir", ".");
		assert (someDir.toString()).equals("/tmp/dir/../otherDir/.");
		Path someDirNormalized = someDir.normalize();
		assert (someDirNormalized.toString()).equals("/tmp/otherDir");
	}

}
