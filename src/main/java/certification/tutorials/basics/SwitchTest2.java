package certification.tutorials.basics;

public class SwitchTest2 {

	public static void main(String[] args) {

		int i = 10;
		switch (i) {
		case 10:
			System.out.println("Ten");
			break; // Transfers control outside the switch statement.

		case 20:
			System.out.println("Ten");
			break; // Transfers control outside the switch statement.
		case 50:
			System.out.println("Ten");
			break; // Transfers control outside the switch statement.

		default:
			System.out.println("No-match");
			break; // Transfers control outside the switch statement. It is not necessary.
		}

	}

}
