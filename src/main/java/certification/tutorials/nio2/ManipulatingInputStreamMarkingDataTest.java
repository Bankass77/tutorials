package certification.tutorials.nio2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * 
 * In this example, we create a byte array data containing the bytes [76, 73,
 * 79, 78], which correspond to the characters 'L', 'I', 'O', 'N'. We then
 * create a ByteArrayInputStream instance inputStream using this data.
 *
 */
public class ManipulatingInputStreamMarkingDataTest {

	public void readData(InputStream is) throws IOException {

		System.out.println((char) is.read());
		if (is.markSupported()) {

			is.mark(100);
			System.out.println((char) is.read());
			System.out.println((char) is.read());
			is.reset();
		}
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());

	}

	public static void main(String[] args) throws IOException {
		String lion = "LION";
		ManipulatingInputStreamMarkingDataTest manipulate = new ManipulatingInputStreamMarkingDataTest();
		byte[] data = lion.getBytes(StandardCharsets.UTF_8);
		try (InputStream buffered = new ByteArrayInputStream(data)) {

			manipulate.readData(buffered);

		}

	}

}
