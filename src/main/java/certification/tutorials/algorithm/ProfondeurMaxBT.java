package certification.tutorials.algorithm;

public class ProfondeurMaxBT {

	public int maximumDepth(TreeNode root) {

		if (root == null) {

			return 0;
		}

		return Math.max(maximumDepth(root.left), maximumDepth(root.right)) + 1;

	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		ProfondeurMaxBT profondeurMaxBT = new ProfondeurMaxBT();

		System.out.println("Maxim depth of BT is: "+profondeurMaxBT.maximumDepth(root));
	}
}
