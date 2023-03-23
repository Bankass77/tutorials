package certification.tutorials.basics;

public class MathUtil {

	public static int max(int x, int y) {

		int max = x;

		if (y > max) {
			max = y;
		}

		return max;
	}

	public static void main(String[] args) {

		int max = MathUtil.max(12, 8);
		System.out.println(max);

		int max2 = MathUtil.max(MathUtil.max(70, 9), 30);
		System.out.println(max2);
	}
}
