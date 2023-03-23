package certification.tutorials.checkTest;

public class TestSwitch {

	public static void main(String[] args) {

		int value = (int) (Math.random() * 11);

		int resultat = switch (value) {
		case 1 -> 1;

		case 2, 3, 4, 5 -> (short) 2;

		default -> 10;

		};

		System.out.println(resultat);
	}
}
