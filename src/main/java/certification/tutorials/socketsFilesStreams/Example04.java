package certification.tutorials.socketsFilesStreams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Example04 {

	public static void main(String[] args) throws  IOException {
		String pathString= System.getProperty("java.io.tmpdir");
		List<String> fileNames= new ArrayList<String> ();
		
		DirectoryStream<Path> directoryStream;
		directoryStream= Files.newDirectoryStream(Paths.get(pathString));
		for (Path path : directoryStream) {
			fileNames.add(path.toString());
		}

		for (String path2 : fileNames) {
			String fileType=Files.isDirectory(Paths.get(path2))?"Dir":"Fil";
			
			//System.out.println("path2: "+ path2);
			System.out.println("file type is: "+ fileType + " " + path2);
		}
	}

}
