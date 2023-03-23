package certification.tutorials.basics;

public class SwitchTest3 {

	public static void main(String[] args) {

		int i = 10;
		String message = switch (i) {
		case 10 -> "i is 10";

		case 20 -> "i is 20";

		case 50 -> "i is 50";

		default -> "i is neither 10 nor 20, 50";

		};
		System.out.println(message);
	}
}
