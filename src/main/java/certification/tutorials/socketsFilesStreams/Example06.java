package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example06 {

	public static void main(String[] args) {

		String pathString = System.getProperty("user.home") + "/javaTemp/";
		Path pathDirectory = Paths.get(pathString);

		if (Files.exists(pathDirectory)) {
			System.out.println("WARNING: directory exists already at: " + pathString);
		} else {

			try {
				// create the directory

				Files.createDirectories(pathDirectory);
				System.out.println("New directory created at: " + pathString);
			} catch (Exception e) {
				System.out.println("Could not create directory" + pathString);
				System.out.println("Exception: " + e.getMessage());
			}
		}

		String fileName = "temp.txt";

		Path pathFile = Paths.get(pathString + fileName);

		if (Files.exists(pathFile)) {

			System.out.println("WARNING: file exist already at: " + pathFile);
		} else {

			try {
				// create file
				Files.createFile(pathFile);
				System.out.println("New File created at :" + pathFile);
			} catch (Exception e) {

				System.out.println("Could not create file" + pathFile);
				System.out.println("Exception: " + e.getMessage());
			}

		}

	}

}
