package certification.tutorials.basics;

public class SwitchTest {

	public static void main(String[] args) {
		int i = 10;

		switch (i) {
		case 10 -> System.out.println("Ten"); // Found the match and Execution starts here
		case 20 -> System.out.println("Twenty");// also executes this statement;

		default -> throw new IllegalArgumentException("Unexpected value: " + i); // Also executes this statement

		// output is: Ten
		}
		System.out.println("-----------------------------------------------------------");
		//
		int j = 50;

		switch (j) {
		case 10 -> System.out.println("Ten");
		case 20 -> System.out.println("Twenty");

		default -> System.out.println("No-match"); // Execution start here

		// output is : No-match
		}

		System.out.println("-----------------------------------------------------------");
		int k = 50;

		switch (k) {
		case 10 -> System.out.println("Ten");
		default -> System.out.println("No-match"); // execution start here
		case 20 -> System.out.println("Twenty");
		}

		// output are : No-match and Twenty
	}

}
