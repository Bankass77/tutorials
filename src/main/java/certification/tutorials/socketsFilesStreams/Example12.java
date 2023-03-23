package certification.tutorials.socketsFilesStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Example12 {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(System.getProperty("user.home") + "/javaTemp/temp.txt");

			int c;
			while ((c = fileInputStream.read()) != -1) {
				System.out.println(c);

			}
		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}

	}

}
