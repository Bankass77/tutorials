package certification.tutorials.nio2;

import java.io.Console;
import java.util.Locale;

public class FormattingConsoleDataTest {

	public static void main(String[] args) {

		Console console = System.console();
		if (console == null) {

			throw new RuntimeException("Console not available");

		} else {
			console.writer().println("Welcome to our Zoo!");
			console.format("It has %d animals and employs %d people", 391, 25);
			console.writer().format(new Locale("fr", "CA"), "Hello Word");
			console.writer().println();
			console.printf("The zoo spans %5.1f acres", 128.91);

		}

	}

}
