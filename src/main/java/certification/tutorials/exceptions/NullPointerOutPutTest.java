package certification.tutorials.exceptions;

/**
 * 
 * With a helpful NullPointerException, the program will print the variable that
 * triggered the exception. In this case, the first exception is when tea is
 * unboxed to a double on line 22, making option A correct. Lines 19–21 do not
 * throw a NullPointerException because instanceof applied to a null value is
 * always false, causing line 21 to be skipped
 *
 */
public class NullPointerOutPutTest {

	public static void main(String[] args) {
		Double tea = null;

		Object coffee = (Integer) null;
		String juice = "";
		if (coffee instanceof Integer x) {

			System.out.println(x.intValue());
		} else if (tea < juice.length()) {

			System.out.println(tea);
		}
	}

}
