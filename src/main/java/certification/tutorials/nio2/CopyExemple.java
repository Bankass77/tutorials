package certification.tutorials.nio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExemple {

	public static void copy(InputStream in, OutputStream out) throws IOException {

		byte[] bytes = new byte[8192];
		int size;

		while ((size = in.read()) != -1) {

			out.write(bytes, 0, size);

		}

	}

	public static void main(String[] args) {
		String srcFilePath = "/home/a.guindo/lorumsum.txt";
		String destFilePath = "/home/a.guindo/out.txt";

		try (InputStream input = new FileInputStream(srcFilePath);
				OutputStream output = new FileOutputStream(destFilePath)) {

			input.transferTo(System.out);

			// or use copy method

			copy(input, output);

			input.close();
			output.close();

		} // calls close() implicitly here // appel output.close() puis input.close()
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
