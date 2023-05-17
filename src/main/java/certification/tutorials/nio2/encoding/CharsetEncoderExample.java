package certification.tutorials.nio2.encoding;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoderExample {

	public static void main(String[] args) {
		
		Charset charset= Charset.forName("UTF-8");
		
		CharsetEncoder  encoder= charset.newEncoder();
		
		CharBuffer charBuffer = CharBuffer.wrap("Hello World");
		
		try {
			
			ByteBuffer byteBuffer= encoder.encode(charBuffer);
			 byte [] bytes= new byte[byteBuffer.remaining()];
			 byteBuffer.get(bytes);
			 System.out.println(new String(bytes, charset));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
