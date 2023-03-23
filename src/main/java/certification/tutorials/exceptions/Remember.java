package certification.tutorials.exceptions;

import java.io.IOException;

public class Remember {

	public static void think() throws IOException {

		try {
			throw Exception(); // need new Keyword

		} catch (RuntimeException r) {

		}
	}

	public static void main(String[] args) throws Exception {

		think();
	}
}
