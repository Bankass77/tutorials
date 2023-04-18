package certification.tutorials.basics;

/**
 * 
 * With a helpful NullPointerException, the program will print the variable that
 * triggered the exception. In this case, the first exception is when tea is
 * unboxed to a double on line 18. Lines 18–20 do not throw a
 * NullPointerException because instanceof applied to a null value is always
 * false, causing line 19 to be skipped
 *
 */
public class InstanceOfTesting {

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
