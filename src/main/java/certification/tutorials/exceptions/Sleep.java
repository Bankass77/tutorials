package certification.tutorials.exceptions;

/**
 * 
 * The finally block of the snore() method throws a new checked exception on
 * line x1, but there is no try-catch block around it to handle it, nor does the
 * snore() method declare any checked exceptions. For these reasons, line x2
 * does not compile Note that line x2 compiles because it is rethrowing an
 * unchecked exception.
 */
public class Sleep {
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException | Error e) {
			System.out.print("Awake!");
			throw e; // x1
		} finally {
			throw new Exception(); // x2
		}
	}

	public static void main(String[] sheep) {
		new Sleep().snore(); // x3
	}

}
