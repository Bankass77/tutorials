package certification.tutorials.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

/*
 * relativize: chemin entre deux Path
 * La méthode relativize permet d'obtenir le Path relative entre deux Path, 
 * c'est à dire le chemin à traverser pour aller de l'un à l'autre:
 * WARNING
 * Assez logiquement, cette méthode n'est pas symétrique: le chemin relatif 
 * entre deux Path n'est pas le même suivant qu'un Path est choisi comme source ou destination.
 * 
 */
public class RelativizeExample {

	@Test
	public void relativize() {

		Path someDir = Paths.get("/tmp", "dir");

		Path someOtherDir = Paths.get("/tmp", "otherDir");

		Path fromSomeDirToSomeOtherDir = someDir.relativize(someOtherDir);

		assert (fromSomeDirToSomeOtherDir.toString()).equals("../otherDir");

		Path someOtherDirToSomeDir = someOtherDir.relativize(someDir);

		assert (someOtherDirToSomeDir.toString()).equals("../dir");

	}

}
