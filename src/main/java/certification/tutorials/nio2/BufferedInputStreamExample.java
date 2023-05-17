package certification.tutorials.nio2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {
		 Path path = Paths.get("/home/lorumsum.txt");
		 InputStream wrapper =new FileInputStream("");
		 try (InputStream is= new FileInputStream(path.toFile()); BufferedInputStream  inputStream= new BufferedInputStream(is, 8192)){
			int data ;
			
			
			while ((data= inputStream.read()) != -1) {
				System.out.println( data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
