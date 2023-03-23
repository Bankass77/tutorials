package certification.tutorials.process;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Example04 {

	public static void main(String[] args) {

		ProcessBuilder processBuilder = new ProcessBuilder("firefox");
		Process process = null;

		try {
			process = processBuilder.start();
		} catch (IOException e) {
			System.out.println("WARNING : something happened with exec");
		}

		try {
			process.waitFor(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("WAINTING : interruption happened");
		}

		process.destroy();
	}

}
