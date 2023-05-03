package certification.tutorials.algorithm;

public class ValidBST {

	/**
	 * @param root
	 * @return true or false if TreeNode is not a valid BST
	 */
	public boolean isValidBST(TreeNode root) {

		return valid(root, null, null);

	}

	/**
	 * @param root
	 * @param low
	 * @param high
	 * @return true or false if TreeNode is not a valid BST
	 */
	private boolean valid(TreeNode root, Integer low, Integer high) {

		if (root == null) {
			return true;
		}
		return ( low==null ||root.value > low) && (high ==null || root.value <high)
				 && valid(root.left, low, root.value)
				&& valid(root.right, root.value, high);
	}
	
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(2);
		root.left.value=1;
		root.right.value=3;
		
		ValidBST validBST= new ValidBST();
		System.out.println(validBST.isValidBST(root));
		
		
	}

}
