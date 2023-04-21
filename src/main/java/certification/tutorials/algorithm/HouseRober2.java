package certification.tutorials.algorithm;

public class HouseRober2 {

	public static int rob(int[] nums) {
		int n = nums.length;
		if (n == 0) {

			return 0;
		} else if (n == 1) {

			return nums[0];
		}
		return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));

	}

	private static int rob(int[] nums, int start, int end) {

		int previousMax = 0, currentMax = 0;

		for (int i=start ; i<=end; i++) {

			int temp = currentMax;
			currentMax = Math.max(nums[i] + previousMax, currentMax);
			previousMax = temp;

		}

		return currentMax;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };

		System.out.println(rob(nums));
	}

}
