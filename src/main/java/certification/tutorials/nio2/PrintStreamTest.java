package certification.tutorials.nio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintStreamTest {

	public static void main(String[] args){
		

		var reader= new BufferedReader(new InputStreamReader(System.in));
		try(reader){  // Throws IOException
			
			
		}
		
		String data= reader.readLine();   // Throws IOException
	}

}
