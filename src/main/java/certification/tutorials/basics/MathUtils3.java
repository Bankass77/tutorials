package certification.tutorials.basics;

public class MathUtils3 {

	public static int max(int[] num) {

		/* Must check for zero element in num here */
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {

				max = num[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[] num1 = new int[] { 10, 1 };

		int max1 = MathUtils3.max(num1);
		System.out.println(max1);
		int[] num2 = new int[] { 10, 8, 18 };
		int max2 = MathUtils3.max(num2);
		System.out.println(max2);
	}
}
