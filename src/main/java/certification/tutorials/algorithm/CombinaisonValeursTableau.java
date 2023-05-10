package certification.tutorials.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CombinaisonValeursTableau {

	List<List<Integer>> generateCombinaison(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> combiniason = new ArrayList<>();

		generate(nums, 0, combiniason, result);
		return result;

	}

	private void generate(int[] nums, int index, List<Integer> combiniason, List<List<Integer>> result) {

		result.add(new ArrayList<>(combiniason));

		for (int j = index; j <=nums.length-1; j++) {

			combiniason.add(nums[j]);

			generate(nums, j + 1, combiniason, result);
			combiniason.remove(combiniason.size() - 1);

		}

	}

	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3 };

		CombinaisonValeursTableau combinaisonValeursTableau = new CombinaisonValeursTableau();

		System.out.println(combinaisonValeursTableau.generateCombinaison(nums));

	}

}
