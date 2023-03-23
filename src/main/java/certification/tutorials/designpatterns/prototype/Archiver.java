package certification.tutorials.designpatterns.prototype;

import java.io.File;

public interface Archiver {

	public void archive(File directFile);

	public Archiver clone();

}
