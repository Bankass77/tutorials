package certification.tutorials.string;

/**
 * 
 * The original sample prints false, followed by george likes bananas with a
 * trailing space. isBlank() and strip()
 * work the same way as the originals. The key difference is that the
 * replacements can handle an extended range of whitespace characters.
 *
 */
public class ReplaceIsEmptyAndTrimWithOther {

	public static void main(String[] args) {
		String curious = "george likes bananas ";
		System.out.println(curious.isEmpty());
		System.out.println("isEmpty() will be replace by isblank()");
		System.out.println(curious.isBlank());
		System.out.println(curious.strip());

	}

}
