package certification.tutorials.designpatterns.prototype;

import java.io.File;
import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class ZipArchiver implements Archiver, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void archive(File directory) {

		System.out.println("Zip archiver");
	}

	@Override
	public Archiver clone() {

		return (Archiver) SerializationUtils.clone(this);
	}

}
