package certification.tutorials.basics;

public class MathUtil2 {

	public static int max(int x, int y) {

		int max = x;
		if (y > max) {

			max = y;
		}
		return max;
	}

	public static int max(int x, int y, int z) {

		int max = x;
		if (y > max) {

			max = y;
		}

		if (z > max) {

			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		int max1 = MathUtil2.max(12, 8);
		int max2 = MathUtil2.max(10, 8, 18);
		System.out.println(max1);
		System.out.println(max2);
	}
}
