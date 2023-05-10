package certification.tutorials.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BTMaximuPathSum {

	private int maxSum;

	private int maxPathSum(TreeNode root) {

		if (root == null) {

			return 0;
		}

		maxSum = Integer.MIN_VALUE;
		findMax(root);
		return maxSum;
	}

	private int findMax(TreeNode p) {

		if (p == null) {

			return 0;
		}

		int left = findMax(p.left);
		int right = findMax(p.right);
		maxSum = Math.max(p.value + left + right, maxSum);
		int ret = p.value + Math.max(left, right);

		return ret > 0 ? ret : 0;
	}

	public static void main(String[] args) {

		TreeNode rootNode = new TreeNode(1);
		rootNode.left = new TreeNode(2);
		rootNode.left.left = new TreeNode(2);
		rootNode.left.right = new TreeNode(3);
		rootNode.right = new TreeNode(4);

		BTMaximuPathSum btMaximuPathSum = new BTMaximuPathSum();

		System.out.println(btMaximuPathSum.maxPathSum(rootNode));

	}

}
