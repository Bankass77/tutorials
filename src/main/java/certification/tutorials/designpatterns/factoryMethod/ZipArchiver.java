package certification.tutorials.designpatterns.factoryMethod;

import java.io.File;
import java.io.Serializable;

public class ZipArchiver implements Archiver, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void archive(File directory) {
		System.out.println("zip archiver");
	}

}
