package certification.tutorials.nio2.encoding;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class CharsetDecoderExample {

	public static void main(String[] args) {

		Charset charset = Charset.forName("UTF-8");

		CharsetDecoder charsetDecoder = charset.newDecoder();
		// Example de decodage d'octetes en caractères

		ByteBuffer buffer = ByteBuffer.wrap(new byte[] { 72, 101, 108, 108, 111 });

		try {
			CharBuffer charBuffer = charsetDecoder.decode(buffer);
			System.out.println(charBuffer.toString()); // affiche "Hello"
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
