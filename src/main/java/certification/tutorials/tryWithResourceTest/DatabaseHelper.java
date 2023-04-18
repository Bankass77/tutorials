package certification.tutorials.tryWithResourceTest;

import java.io.Closeable;
import java.sql.SQLException;

/**
 * 
 * The Closeable interface defines a close() method that throws IOException. The
 * overridden implementation of MyDatabase, which implements Closeable, declares
 * a SQLException. This is a new checked exception not found in the inherited
 * method signature. Therefore, the method override is invalid, and the close()
 * method in MyDatabase does not compile,
 *
 */
public class DatabaseHelper {
	static class MyDatabase implements Closeable {
		public void close() throws SQLException {
			System.out.print("2");
		}

		public void write(String data) {
		}

		public String read() {
			return null;
		}
	}

	public static void main(String[] files) throws Exception {
		try (MyDatabase myDb = new MyDatabase()) {
			// TODO: Decide what to read/rite
		} finally {
			System.out.print("1");
		}
	}

}
