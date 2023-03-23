package certification.tutorials.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DoWhileExemple3 {

	public static void main(String[] args) throws FileNotFoundException {

		String filePath = "./lorumsum.txt";

		BufferedReader bf = new BufferedReader(new FileReader(filePath));

		String line;

		try {
			do {
				line = bf.readLine();

				if (line != null) {

					System.out.println(line);
				}
			} while (line != null);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
