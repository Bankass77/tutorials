package certification.tutorials.basics;

public class BreakExemple {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.println(i + " " + j);
				if (i == j) {

					break; // Exit the inner for loop
				}
				System.out.println("\t");
			}
			System.out.println();
		}

	}

}
