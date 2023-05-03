package certification.tutorials.algorithm;

public class BalancedBT {

	public boolean isBalanced(TreeNode root) {

		if (root == null)
			return true;

		return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
	}

	private int maxDepth(TreeNode p) {

		if (p == null)
			return 0;

		return Math.max(maxDepth(p.left), maxDepth(p.right)) + 1;
	}

	public static void main(String[] args) {
		
		TreeNode treeNode= new TreeNode(3);
		treeNode.left= new TreeNode(9);
		treeNode.right= new TreeNode(20);
		treeNode.left.left=null;
		treeNode.left.right=null;
		treeNode.right.right= new TreeNode(7);
		treeNode.right.left= new TreeNode(15);
		
		BalancedBT balancedBT= new BalancedBT();
		
		System.out.println(balancedBT.isBalanced(treeNode));
		
		

	}

}
