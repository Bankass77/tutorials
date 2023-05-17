package certification.tutorials.nio2.path;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {

	public static void main(String[] args) {

		String data = "This example shows how to write to a File using FileChannel. \n\" +"
				+ "FileChannel can be faster thant standard I/O if you're dealing with large files ";

		try (RandomAccessFile randomAccessFile = new RandomAccessFile("demo.txt", "rw")) {

			FileChannel fileChannel = randomAccessFile.getChannel();

			// create a byte buffer with sufficient capacity to accomadate the data

			byte[] byteData = data.getBytes();
			ByteBuffer byteBuffer = ByteBuffer.allocate(byteData.length);

			// Transfert the content of the byte array to the buffer

			byteBuffer.put(byteData);
			// Move to the start position to prepare for channel write

			byteBuffer.flip();

			// Writes a sequence of bytes to the channel from the given buffer
			fileChannel.write(byteBuffer);

		} catch (IOException e) {

			System.out.format("IO error: %s%n", e);
		}

	}

}
