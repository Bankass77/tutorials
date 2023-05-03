package certification.tutorials.algorithm;

public class InOrderTraversalBT {

	private TreeNode prev;

	public boolean isValidBST(TreeNode root) {

		if (root == null)
			return true;

		return isMonotonicIncreasing(root);
	}

	private boolean isMonotonicIncreasing(TreeNode p) {

		if (p == null) {

			return true;
		}

		if (isMonotonicIncreasing(p.left)) {

			if (prev != null && p.value <= prev.value) {
				return false;

			}

			prev = p;
			return isMonotonicIncreasing(p.right);

		}

		return false;
	}

	public static void main(String[] args) {

		TreeNode rooNode = new TreeNode(2);
		rooNode.left.value = 1;
		rooNode.right.value = 3;
		
		TreeNode root = new TreeNode(2);
		root.left.value = 5;
		root.right.value = 3;
		InOrderTraversalBT inOrderTraversalBST = new InOrderTraversalBT();
		System.out.println("rooNode: "+inOrderTraversalBST.isValidBST(rooNode));
		System.out.println("------------TreeNode is not a BST ---------------");
		System.out.println("root: "+inOrderTraversalBST.isValidBST(root));
	}

}
