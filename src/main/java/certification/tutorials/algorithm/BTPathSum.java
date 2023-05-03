package certification.tutorials.algorithm;

/**
 * 
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true Explanation: The root-to-leaf path with the target sum is shown
 *
 */
public class BTPathSum {

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null) {

			return false;
		}

		if (root.left == null && root.right == null && root.value == targetSum) {
			// We have reached a leaf node and the remaining target sum is equal to the
			// value of the leaf node

			return true;
		}

		// Recursively check if the left or right child has a root-to-leaf path that
		// adds up to the remaining target sum
		return hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value);
	}

	public static void main(String[] args) {

	}

}
