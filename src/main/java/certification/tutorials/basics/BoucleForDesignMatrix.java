package certification.tutorials.basics;

public class BoucleForDesignMatrix {

	public static void main(String[] args) {
		// The code to print the 3 × 3 matrix can be written as follows:
		// 11      12      13
		// 21      22      23
		// 31      32      33

		// Outer for-loop statement

		for (int i = 1; i <= 3; i++) {

			// Inner for-loop statement

			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
				// Prints a tab after each column value
				System.out.println("\t");
			}

			System.out.println(); // Prints a new line

		}

	}

}
