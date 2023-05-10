package certification.tutorials.jdbc;

import java.io.Closeable;
import java.sql.SQLException;

public class DatabaseHelper {
	static class MyDatabase implements Closeable {
	      public void close() throws SQLException {
	         System.out.print("2");
	      }
	      public void write(String data) {}
	      public String read() {return null;}
	   }
	   public static void main(String[] files) throws Exception {
	      try (MyDatabase myDb = new MyDatabase()) {
	         // TODO: Decide what to read/rite
	      } finally {
	         System.out.print("1");
	      } }

}
