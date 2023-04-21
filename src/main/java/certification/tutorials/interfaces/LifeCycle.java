package certification.tutorials.interfaces;

/**
 * 
 * The code does not compile because john is declared in the try-with-resources
 * statement and not in scope in the finally block
 *
 */
public class LifeCycle {
	public static void main(String[] bits) {
		try (DiskPlayer john = new DiskPlayer()) {
			System.out.println("ping");
			john.close();
		} finally {
			System.out.println("pong");
			john.close();
		}
		System.out.println("return");
	}

}
