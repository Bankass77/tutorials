package certification.tutorials.process;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

public class Example06 {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();

		Process process = null;
		try {
			process = runtime.exec(
					"java -cp ../../../../javadatastructures/algorithms/process/Example05/out/Example05;Example05");
		} catch (IOException e) {
			System.out.println("WARNING: couldn't start your app");
		}

		try {
			process.waitFor(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("WARNING : interruped exception fired");
		}
		// Write to child's System.in
		OutputStream out = process.getOutputStream();

		Writer writer = new OutputStreamWriter(out);
		writer.write("This is how we roll!\n");
		writer.flush();
		process.destroy();

	}

}
