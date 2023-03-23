package certification.tutorials.designpatterns.prototype;

import java.io.File;

public class DemoPrototype {

	public static void main(String[] args) {
		String archiverType1 = "zip";
		String arciverType2 = "rar";

		Archiver zipArchiver = ArchiverFactory.getPrototypeForType(archiverType1);
		Archiver rarArchiver2 = ArchiverFactory.getPrototypeForType(arciverType2);
		zipArchiver.archive(new File(""));
		rarArchiver2.archive(new File(""));

	}

}
