package certification.tutorials;

import java.io.Console;

public class TestConsoleClass {

	public static void main(String[] args) {
		Console console = System.console();
		var w = console.writer();
		try (w) {

			String secret = console.readPassword("Secret %d:", 5);
			w.format("Your secret:" + secret + "%n");
		}
	}

}
