package certification.tutorials.exceptions;

/**
 * 
 * While RuntimeException is broader than IllegalArgumentException, the
 * restriction on overriding methods applies only to checked exceptions, not
 * unchecked exceptions. In other words, the code would not compile if both of
 * the exceptions were checked. Since they are unchecked, though, the method
 * override is valid. The program compiles and prints thud?
 *
 */
public class Stool extends Chair {
	public void sit() throws RuntimeException {
		System.out.print("thud");
	}

	public static void main(String[] c) throws Exception {
		try {
			new Stool().sit();
		} finally {
			System.out.print("?");
		}
	}

}
