package certification.tutorials.path;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExemple {

	public static void main(String[] args) {

		try (RandomAccessFile randomAccessFile = new RandomAccessFile("demo.txt", "rw")) {

			randomAccessFile.seek(10);
			randomAccessFile.writeChar('-');
			randomAccessFile.writeInt(123456);
			randomAccessFile.writeChar('-');
		} catch (IOException e) {
			System.out.format("IO error: %s%n", e);
		}

	}

}
