package certification.tutorials.process;

import java.io.IOException;

public class Example05 {

	public static void main(String[] args) throws IOException {

		int c;
		System.out.println("Let's echo: ");

		while ((c = System.in.read()) != '\n') {
			System.out.println((char) c);
		}
	}

}
