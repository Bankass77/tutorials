package certification.tutorials.exceptions;

/**
 * 
 * The second catch block on line p2 does not compile. Since
 * IllegalArgumentException is a subclass of Exception, they cannot be used in
 * the same multi-catch block since it is redundant
 *
 */

public class Accountant {
	public void doTaxes() throws Throwable {
		try {
			throw new NumberFormatException();
		} catch (ClassCastException | ArithmeticException e) { // p1
			System.out.println("Math");
		} catch (IllegalArgumentException | Exception f) { // p2
			System.out.println("Unknown");
		}
	}

	public static void main(String[] numbers) throws Throwable {
		try {
			new Accountant().doTaxes();
		} finally {
			System.out.println("Done!");
		}
	}

}
