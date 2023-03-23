package certification.tutorials.checkTest;

public class NestedLoop {

	public static void main(String[] args) {

		int hungryHippopotamus = 8;

		while (hungryHippopotamus > 0) {
			do {
				hungryHippopotamus -= 2;

			} while (hungryHippopotamus > 5);

			hungryHippopotamus--;
			System.out.println(hungryHippopotamus + ",");
		}

		System.out.println("-----------------");
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();

		}
	}
}
