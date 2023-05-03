package certification.tutorials.testing;

public class TestDataExactlyTwoDifferentMinimums {

	static int[] array = new int[2];

	public static int[] get_array() {

		int minValue = 0;
		int nextMinValue = 0;

		int[] newArray = new int[2];
		for (int i = 0; i < array.length; i++) {

			if (array[i] < array[minValue]) {

				minValue = i;
				nextMinValue = i + 1;
			}

		}
		newArray[0] = minValue;
		newArray[1] = nextMinValue;

		return newArray;
	}

	public static int get_expected_result() {

		int minValue = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < array[minValue]) {
				minValue = i;

			}
		}
		return minValue;
	}

}
