package certification.tutorials.nio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class InputStreamOutputStream {

	public void copyStream(InputStream in, OutputStream out) throws IOException {

		int b;

		while ((b = in.read()) != -1) {

			out.write(b);
		}

	}

	public void copyStream2(Reader in, Writer output) throws IOException {

		int b;
		while ((b = in.read()) != -1) {

			output.write(b);

		}
	}

	public void copyStream3(InputStream in, OutputStream outputStream) throws IOException {

		int batchSize = 1024;

		var buffer = new byte[batchSize];

		int lengthRead = -1;

		while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {

			outputStream.write(buffer, 0, lengthRead);
			outputStream.flush();
		}
	}

	public void copyTextFile(File src, File dest) throws IOException {

		try (var reader = new BufferedReader(new FileReader(src));
				var writer = new BufferedWriter(new FileWriter(dest))) {

			String line = null;

			while ((line = reader.readLine()) != null) {

				writer.write(line);
				writer.flush();
				writer.newLine();
			}
		}
	}

	public void copyFileText(File src, File dest) throws IOException {

		try (var reader = new BufferedReader(new FileReader(src)); var writer = new PrintWriter(new FileWriter(dest))) {
			String line = null;

			while ((line = reader.readLine()) != null) {

				writer.println(line);
				writer.flush();
			}
		}
	}

	public void copyPatAsString(Path input, Path ouput) throws IOException {

		String read = Files.readString(input);

		Files.writeString(ouput, read);

	}

	public void copyPathAsBytes(Path input, Path output) throws IOException {

		byte[] bytes = Files.readAllBytes(input);

		Files.write(output, bytes);

	}

	private void copyPatAsLine(Path input, Path output) throws IOException {

		List<String> lines = Files.readAllLines(input);

		Files.write(output, lines);
	}

	private void readLazily(Path path) throws IOException {

		try (Stream<String> s = Files.lines(path)) {
			s.forEach(System.out::println);
		}
	}

	private void readLazily2(Path path) throws IOException {

		try (var s = Files.lines(path)) {
			s.filter(f -> f.startsWith("WARN:")).map(f -> f.substring(5)).forEach(System.out::println);
		}
	}

	private void copyPath(Path input, Path output) throws IOException {
		try (var reader = Files.newBufferedReader(input); var writer = Files.newBufferedWriter(output)) {

			String line = null;

			while ((line = reader.readLine()) != null) {

				writer.write(line);
				writer.newLine();

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
