package certification.tutorials.nio2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {
	
	public static void main(String[] args) {
		
		Path path= Paths.get("/opt");
		try( DirectoryStream<Path> directoryStream=Files.newDirectoryStream(path)){
			
			for (Path path2 : directoryStream) {
				
				System.out.println(path2.getFileName());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
