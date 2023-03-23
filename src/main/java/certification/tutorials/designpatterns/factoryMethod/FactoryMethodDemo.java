package certification.tutorials.designpatterns.factoryMethod;

import java.io.File;

public class FactoryMethodDemo {

	public static void main(String[] args) {

		String zipArchive = "zip";
		String rarArchiver = "rar";

		var archiveFactor1 = ArchiverFactory.getArchiver(zipArchive);
		archiveFactor1.archive(new File(""));

		var archiverfactory2 = ArchiverFactory.getArchiver(rarArchiver);
		archiverfactory2.archive(new File(""));

		System.out.println(ArchiverFactory.getArchiver("zip") == archiveFactor1);
	}

}
