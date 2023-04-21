package certification.tutorials.interfaces.functionaInterfaceTest;

/**
 * 
 * Line 23 does not compile because a static interface method cannot call an
 * instance-based abstract method. Since this is the only line that does not
 * compile
 *
 */
public interface Piano {

	String type = "Grand";

	void play();

	public static int getNumberOfkeys() {

		return type.equals("Grand") ? 88 : 61;

	}

	private static void printPianoInfo() {
		play();
		System.out.println("Key Count: " + getNumberOfkeys());
	}

	default void tune() {
		play();
		printPianoInfo();
	}

}
