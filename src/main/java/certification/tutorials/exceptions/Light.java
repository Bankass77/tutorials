package certification.tutorials.exceptions;

import java.io.IOException;

/**
 * 
 * The code does not compile because the variable v is used twice in the main()
 * method, both in the method declaration and in the catch block
 * . If a different variable name were used in one of the
 * locations, the program would compile and print complete. Note that while an
 * exception is created inside the turnOn() method, it is not thrown.
 *
 */
public class Light {
	public static void main(String[] v) throws Exception {
		try {
			new Light().turnOn();
		} catch (RuntimeException v) { // y1
			System.out.println(v);
			throw new IOException(); // y2
		} finally {
			System.out.println("complete");
		}
	}

	public void turnOn() throws IOException {
		new IOException("Not ready"); // y3
	}

}
