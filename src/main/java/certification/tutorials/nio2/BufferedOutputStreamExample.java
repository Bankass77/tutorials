package certification.tutorials.nio2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
	
		
		Path path = Paths.get("/home/bufferedOuput.txt");
		
		try (OutputStream os= new FileOutputStream(path.toFile()); BufferedOutputStream bos= new BufferedOutputStream(os,8192)) {
			
			String data = "Hello World";
			
			byte [] bytes= data.getBytes();
			bos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
