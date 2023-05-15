package certification.tutorials.nio2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import java.nio.file.Path;

public class InputStreamExample {

	public static void main(String[] args) {
		
		Path path= Path.of("/wget-log");
		
		try( InputStream is= Files.newInputStream(path)){
			
			
			// Lire les données du fichier à l'aide de l'InputStream
			
			int data;
			
			while ((data=is.read()) !=-1) {
				
				// Faire quelque chose avec les données  lues.
				
				System.out.println(data);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
