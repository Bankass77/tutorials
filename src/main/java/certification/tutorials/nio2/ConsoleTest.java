package certification.tutorials.nio2;

import java.io.Console;
import java.io.IOException;

public class ConsoleTest {

	public static void main(String[] args) throws IOException {

		Console console = System.console();
		if (console != null) {

			String userInput = console.readLine();
			console.writer().println("You entered: " + userInput);

		} else {

			System.err.println("Console not available");
		}

	}

}
