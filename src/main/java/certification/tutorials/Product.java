package certification.tutorials;

import java.util.Arrays;

/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
public class Product {

	private static int[] productOdArrayElements(int array[]) {

		if (array == null || array.length == 0) {

			return array;
		}

		int arrayLength = array.length;

		int[] result = new int[arrayLength];

		int temp = 1;

		for (int i = 0; i < arrayLength; i++) {

			result[i] = temp;
			temp *= array[i];
		}

		temp = 1;

		for (int i = arrayLength - 1; i >= 0; i--) {

			result[i] *= temp;

			temp *= array[i];

		}
		return result;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int[] newArray = { 1, 2, 3 };

		System.out.println(Arrays.toString(productOdArrayElements(array)));

		System.out.println(Arrays.toString(productOdArrayElements(newArray)));

	}

}
