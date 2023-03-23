package certification.tutorials.socketsFilesStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example13 {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = null;

		try {

			FileReader fileReader = new FileReader(System.getProperty("user.home") + "/javaTemp/temp.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line;

			while ((line = bufferedReader.readLine()) != null) {

				System.out.println(line);
			}
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}

	}

}
