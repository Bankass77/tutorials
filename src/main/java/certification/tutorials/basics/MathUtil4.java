package certification.tutorials.basics;

public class MathUtil4 {

	public static int max(int... num) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}

	public static int max2(int... num) {

		int max = Integer.MIN_VALUE;
		for (int currentNumber : num) {

			if (currentNumber > max) {

				max = currentNumber;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int max = MathUtil4.max(); // passing no ragument is ok to Var-Args= variable-length-argument
		System.out.println(max);
	}

}
