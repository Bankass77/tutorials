package certification.tutorials.array;

import java.util.Arrays;

/**
 * 
 * The elements of the array are of type String rather than int. Therefore, we
 * use alphabetical order when sorting. The character 1 sorts before the
 * character 9, alphabetically making option A incorrect. Shorter strings sort
 * before longer strings when all the other characters are the same
 *
 */
public class TestArray {

	public static void main(String[] args) {
		String[] nums = new String[] { "1", "9", "10" };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

	}

}
