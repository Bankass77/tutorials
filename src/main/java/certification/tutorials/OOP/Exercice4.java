package certification.tutorials.OOP;

public class Exercice4 {

	public static void main(String[] args) {

		int val1 = 3;
		double val2 = 2.7;
		checkNumber(val1);
		checkNumber(val2);
	}

	public static void checkNumber(Number val) {

		if (val instanceof Integer) {
			System.out.println("it's an Integer");
		}

		if (val instanceof Double) {
			System.out.println("it's a double");
		}
	}
}
