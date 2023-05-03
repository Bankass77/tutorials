package certification.tutorials.algorithm;
// create stack over flow 
public class ValidBSTBruteForce {

	public boolean isValidBST(TreeNode root) {

		if (root == null)
			return true;

		return isSubTreeLessThan(root.left, root.value) && isSubtreeGreatThan(root.right, root.value)
				&& isValidBST(root.left) && isValidBST(root.right);

	}

	private boolean isSubtreeGreatThan(TreeNode p, int value) {

		if (p == null)
			return true;

		return p.value > value && isSubtreeGreatThan(p.left, value) && isSubtreeGreatThan(p.right, value);
	}

	

	private boolean isSubTreeLessThan(TreeNode p, int value) {

		if (p == null) {
			return true;
		}

		return p.value < value && isSubTreeLessThan(p.left, value) && isSubTreeLessThan(p, value);
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(2);

		root.left.value = 1;
		root.right.value = 3;

		ValidBSTBruteForce validBSTBruteForce = new ValidBSTBruteForce();
		System.out.println(validBSTBruteForce.isValidBST(root));

	}

}
