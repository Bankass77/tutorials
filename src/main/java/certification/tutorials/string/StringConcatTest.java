package certification.tutorials.string;

/**
 * 
 * A String is immutable, so a different object is returned on line 13. The
 * object anotherLine points to is of length 2 after line 13 completes. However,
 * the original line reference still points to an object of length 1.
 *
 */
public class StringConcatTest {

	public static void main(String[] args) {
		var line = new String("-");
		var anotherLine = line.concat("-");
		System.out.println(line == anotherLine);
		System.out.println(" ");
		System.out.println(line.length());

	}

}
