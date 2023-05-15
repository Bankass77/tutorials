package certification.tutorials.nio2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ManipulateData {

	public static void main(String[] args)  throws IOException {
		
		var sb= new StringBuilder();
		
		String buffer= "PEACOCKS";
		
		byte [] bs= buffer.getBytes(StandardCharsets.UTF_8);
		
		InputStream reader= new ByteArrayInputStream(bs);
		
		sb.append( (char) reader.read());
		
		reader.mark(10);
		for (int i = 0; i <2; i++) {
			sb.append((char) reader.read());
			reader.skip(2);
		}

		reader.reset();
		reader.skip(0);
		sb.append((char)reader.read());
		System.out.println(sb.toString());
		
	}

}
