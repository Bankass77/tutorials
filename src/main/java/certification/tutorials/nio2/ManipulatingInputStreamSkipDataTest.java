package certification.tutorials.nio2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ManipulatingInputStreamSkipDataTest {

	public void skipData(InputStream is) throws IOException {

		System.out.println((char) is.read());  // T
		is.skip(2);  // Skip I and G
		is.read();   // Reads E but doesn't output it
		System.out.println((char) is.read());   //  R
		System.out.println((char) is.read());  // S

	}

	public static void main(String[] args) {

		String tigers = "TIGERS";

		byte[] data = tigers.getBytes(StandardCharsets.UTF_8);
		ManipulatingInputStreamSkipDataTest skip = new ManipulatingInputStreamSkipDataTest();
		try (InputStream is = new ByteArrayInputStream(data)) {

			skip.skipData(is);

		} catch (IOException e) {

		}

	}

}
