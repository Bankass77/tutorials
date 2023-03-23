package certification.tutorials.recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(6));
	}

	public static final int factorial(int number) {

		if (number == 1 || number == 0) {

			return 1;

		} else {

			return number * factorial(number - 1);
		}

	}

}
