package certification.tutorials.basics;

public class OuterLabelExampleInForLoop {

	public static void main(String[] args) {

		Outer: // defines a label named outer

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.println(i + " " + j);

				if (i == j) {
					break Outer; // Exit the outer for loop
				}

				System.out.println("\t");
			}
			System.out.println();
		} // The outer label ends here

	}

}
