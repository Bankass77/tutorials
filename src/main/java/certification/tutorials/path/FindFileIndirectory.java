package certification.tutorials.path;

import java.io.File;
import java.io.IOException;

public class FindFileIndirectory {

	public static void findAllFilesInFolder(File folder) {

		for (File file : folder.listFiles()) {

			if (!file.isDirectory()) {

				System.out.println(file.getName());
			} else {

				findAllFilesInFolder(file);
			}
		}

	}

	public static void main(String[] args) throws IOException {

		File file = new File("/opt/");

		findAllFilesInFolder(file);

	}
}
