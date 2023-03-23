package certification.tutorials.basics;

public class BoucleForWithoutConditionExpression {

	public static void main(String[] args) {
		for (int num1 = 1;; num1++) {
			System.out.println(num1); // Print the number
			if (num1 == 10) {

				break; // Break out of loop when i is 10

			}
		}

	}

}
