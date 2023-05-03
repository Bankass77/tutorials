package certification.tutorials.algorithm;

public class BalancedTestWithBottomUpMethod {

	/**
	 * @param root
	 * @return true or false if BT is balanced or not
	 */
	public boolean isBalanced(TreeNode root) {

		return maxDepth(root) != -1;

	}

	/**
	 * @param root
	 * @return maxDepth of BT
	 */
	private int maxDepth(TreeNode root) {

		if (root == null)
			return 0;
		int L = maxDepth(root.left);
		if (L == -1)
			return -1;

		int R = maxDepth(root.right);

		if (R == -1)
			return -1;

		return (Math.abs(L - R) <= 1) ? (Math.max(L, R) + 1) : -1;
	}

	public static void main(String[] args) {

		TreeNode treeNode = new TreeNode(3);
		treeNode.left = new TreeNode(9);
		treeNode.right = new TreeNode(20);
		treeNode.left.left = null;
		treeNode.left.right = null;
		treeNode.right.right = new TreeNode(7);
		treeNode.right.left = new TreeNode(15);

		BalancedTestWithBottomUpMethod bottomUpMethod = new BalancedTestWithBottomUpMethod();
		System.out.println(bottomUpMethod.isBalanced(treeNode));

	}

}
