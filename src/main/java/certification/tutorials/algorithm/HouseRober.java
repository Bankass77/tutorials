package certification.tutorials.algorithm;

public class HouseRober {

	public static int rob(int[] nums) {

		if (nums.length == 0 || nums == null) {

			return 0;
		}

		return helperRob(nums, 0);
	}

	private static int helperRob(int[] nums, int index) {

		if (index >= nums.length) {
			return 0;
		}

		int steal = nums[index] + helperRob(nums, index + 2);
		int skip = helperRob(nums, index + 1);

		return Math.max(steal, skip);
	}
	
	// or 
	public static int rob2(int[] nums) {
		int previousMax = 0;
		int currentMax = 0;
		if (nums.length == 0 || nums == null) {
			return 0;
		}

		for (int i : nums) {

			int temp = currentMax;

			currentMax = Math.max(i + previousMax, currentMax);

			previousMax = temp;

		}
		return currentMax;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(rob(nums));
	}
}
