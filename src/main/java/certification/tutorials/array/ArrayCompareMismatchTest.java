package certification.tutorials.array;

import java.util.Arrays;

/**
 * 
 * When the arrays are the same, the compare() method returns 0, while the
 * mismatch() method returns -1. When the arrays are different, mismatch()
 * returns the index of the first element that is different. In our case, this
 * is index 2 By contrast, the compare() method would return a negative number
 * if filling in the third blank since 'i' is smaller than 'o'.
 *
 */
public class ArrayCompareMismatchTest {

	public static void main(String[] args) {
		char[][] letters = new char[][] { new char[] { 'a', 'e', 'i', 'o', 'u' }, new char[] { 'a', 'e', 'o', 'u' } };

		var x = Arrays.mismatch(letters[0], letters[0]);
		var y = Arrays.compare(letters[0], letters[0]);
		var z = Arrays.mismatch(letters[0], letters[1]);

		System.out.print(x + " " + y + " " + z);

	}

}
