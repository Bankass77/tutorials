package certification.tutorials.collections;

import java.util.Arrays;

public class Example02 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		System.out.println("--------fill Arrays---------------");
		Arrays.fill(numbers, 1);

		System.out.println(Arrays.toString(numbers));

		System.out.println("-------Arrays Copy Of Range  -------------");

		int[] shortNumbers = Arrays.copyOfRange(numbers, 0, 2);
		System.out.println(Arrays.toString(shortNumbers));

		System.out.println("---------Copy Of-------------");

		int[] longNumbers = Arrays.copyOf(numbers, 10);
		System.out.println(Arrays.toString(longNumbers));
	}

}
