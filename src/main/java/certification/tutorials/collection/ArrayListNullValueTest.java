package certification.tutorials.collection;

import java.util.Arrays;

/**
 * 
 * The code does compile. Line 13 creates a
 * fixed-size list. While we are using var, the type is List<Intege>˃. Line 19
 * successfully changes the contents of the list to [3, null, 4]. Line 22
 * automatically unboxes to the primitive 3. Line 22 has a problem. The list has
 * a null value at index 1. This cannot be unboxed to a primitive and throws a
 * NullPointerException
 *
 */
public class ArrayListNullValueTest {

	public static void main(String[] args) {
		var numbers = Arrays.asList(3, 1, 4);
		numbers.set(1, null);

		int first = numbers.get(0);
		int middle = numbers.get(1);
		int last = numbers.get(3);
		System.out.println(first + " " + middle + " " + last);
	}

}
