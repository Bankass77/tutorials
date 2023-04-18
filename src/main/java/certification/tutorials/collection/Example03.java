package certification.tutorials.collection;

import java.util.Arrays;

public class Example03 {

	public static void main(String[] args) {

		int[] numbers = new int[3];
		Arrays.fill(numbers, 1);

		int[] numbers2 = { 0, 0, 0 };
		boolean comparison = Arrays.equals(numbers, numbers2);
		System.out.println(comparison);

		int[] numbers3 = { 1, 1, 1 };
		comparison = Arrays.equals(numbers, numbers3);

		System.out.println(comparison);

		int[] numbers4 = { 1, 1 };
		comparison = Arrays.equals(numbers, numbers4);
		System.out.println(comparison);
	}

}
