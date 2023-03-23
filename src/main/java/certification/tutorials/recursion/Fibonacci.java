package certification.tutorials.recursion;

public class Fibonacci {

	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {

			System.out.println(fibonacci(i));
		}
	}

	public static final int fibonacci(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		} else {

			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}

}
