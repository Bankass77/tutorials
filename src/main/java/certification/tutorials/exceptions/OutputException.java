package certification.tutorials.exceptions;

/**
 * 
 * With a helpful NullPointerException, the program will print the variable that
 * triggered the exception. In this case, the first exception is on line 17. The
 * Integer value of null is unboxed to an int, but since this fails, a
 * NullPointerException is thrown at runtime. Since the exception happens on the
 * right side of the assignment, the name of the variable printed is null
 *
 */
public class OutputException {

	public static void main(String[] args) {
		String mode = null;

		int grade = (Integer) null;
		Integer average = null;
		if (grade >= average && Integer.parseInt(mode) > 0) {

			System.out.println("You passed !");
		}

	}

}
