package certification.tutorials.exceptions;

/**
 * 
 * The order of catch blocks is important because they’re checked in the order
 * they appear after the try block. Because ArithmeticException is a child class
 * of RuntimeException, the catch block on line 20 is unreachable (if an
 * ArithmeticException is thrown in the try block, it will be caught on line 18).
 * Line 20 generates a compiler error because it is unreachable code
 * 
 *
 */
public class RuntimeExceptionTest {
	public static void main(String[] args) {
		int a = 0, b = 0;
		try {
			System.out.print(a / b);
		} catch (RuntimeException e) {
			System.out.print(-1);
		} catch (ArithmeticException e) {
			System.out.print(0);
		} finally {
			System.out.print("done");
		}
	}

}
