package certification.tutorials.basics;

public class DoWhileExemple {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		do {
			sum += i;
			i++;
		} while (i <= 10);
		// Print the result
		System.out.println("sum=" + sum);
	}

}
