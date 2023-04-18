package certification.tutorials.methodTest;

/**
 * 
 * The Dress type is declared as a class, not an interface. For this reason, it
 * cannot contain the default method getSize(). The
 * rest of the methods compile within the class declaration without issue.
 *
 */
public class Dress {
	int size = 10;

	default int getSize() {
		display();
		return size;
	}

	static void display() {
		System.out.print("What a pretty outfit!");
	}

	private int getLength() {
		display();
		return 15;
	}

	private static void tryOn() {
		display();
	}

}
