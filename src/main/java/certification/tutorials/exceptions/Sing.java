package certification.tutorials.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 * 
 * An overriding method cannot declare any new or broader checked exceptions than the overridden method.
 *
 */
public class Sing extends Music {
	public void make() /* throws  FileNotFoundException or throws throws  NumberFormatException */ {
	      System.out.println("do-re-mi-fa-so-la-ti-do");
	   } 
}