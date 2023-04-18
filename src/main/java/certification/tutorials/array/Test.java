package certification.tutorials.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The code compiles correctly. After line 20, the list contains [4, 7]. Line 21
 * replaces a value, making the result [4, 5]. Line 22 adds a new value to the
 * end, giving us [4, 5, 8]. Finally, line 23 removes the element at index 0,
 * resulting in a final value of [5, 8].
 *
 */
public class Test {

	public static void main(String[] args) {
		List<String> numbers = new ArrayList<>();

		numbers.add("4");
		numbers.add("7");
		numbers.set(1, "5");
		numbers.add("8");
		numbers.remove(0);
		for (String number : numbers) {

			System.out.println(number);
		}
	}

}
