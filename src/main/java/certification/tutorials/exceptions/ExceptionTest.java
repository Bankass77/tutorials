package certification.tutorials.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 
 * The first compiler error is on line 19 because each resource in a
 * try-with-resources statement must have its own data type and be separated by
 * a semicolon (;). Line 22 does not compile because the variable s is already
 * declared in the method. Line 18 also does not compile. The
 * FileNotFoundException, which inherits from IOException and Exception, is a
 * checked exception, so it must be handled in a try/catch block or declared by
 * the method. Because these three lines of code do not compile
 *
 */
public class ExceptionTest {
	public void tryAgain(String s) {
		try (FileReader r = null,p = new FileReader("")) {
			System.out.print("X");
			throw new IllegalArgumentException();
		} catch (Exception s) {
			 System.out.print("A");
			 throw new FileNotFoundException();
		}finally {
			System.out.print("O");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
