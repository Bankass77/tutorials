package certification.tutorials.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * When do you use a do-while statement instead of a while statement? You can
 * rewrite every do-while statement as a while statement and vice versa.
 * However, using the do-while statement in some use cases makes your code more
 * readable
 *
 */
public class DoWhileExemple2 {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "./lorumsum.txt";

		BufferedReader bfBufferedReader = new BufferedReader(new FileReader(filePath));

		String line;

		try {
			while ((line = bfBufferedReader.readLine()) != null) {

				System.out.println(line);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
