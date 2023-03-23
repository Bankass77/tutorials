package certification.tutorials.array;

import java.util.Arrays;

public class ArrayUlitiesDemo {

	public static void main(String[] args) {

		int[] array = { 4, 2 };

		System.out.println(Arrays.toString(array));

		System.out.println("----------------------------------------");

		// or
		Arrays.stream(array).forEach(ai -> System.out.println(ai));
		System.out.println("----------------------------------------");

		// or

		Arrays.stream(array).forEach(System.out::println);

		System.out.println("----------------------------------------");
		//

		Arrays.sort(array);

		System.out.println("----------------------------------------");
		array = new int[] { 5, 2, 1, 5, 7 };
		Arrays.sort(array);
		int foundAt = Arrays.binarySearch(array, 5);
		System.out.println("Key fount at:" + foundAt);

		System.out.println("----------------------------------------");
		Arrays.compare(array, array);

		System.out.println(Arrays.compare(array, array));
	}

}
