package certification.tutorials.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

public class Example07 {

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

		// Prepare the data logger
		File file = new File("data.log");

		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		// read from System.ou from the child
		InputStream in = process.getInputStream();
		Reader reader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();

		// send to Screen

		bufferedWriter.write(line);
		bufferedWriter.flush();
		process.destroy();
	}
}
