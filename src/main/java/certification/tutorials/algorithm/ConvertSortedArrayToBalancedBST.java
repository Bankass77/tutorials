package certification.tutorials.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBalancedBST {

	public TreeNode sortedArrayToBST(int[] num) {

		return sortedArrayToBST(num, 0, num.length - 1);

	}

	private TreeNode sortedArrayToBST(int[] array, int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;

		TreeNode node = new TreeNode(array[mid]);
		node.left = sortedArrayToBST(array, start, mid - 1);
		node.right = sortedArrayToBST(array, mid + 1, end);

		return node;
	}

	public static void main(String[] args) {

		TreeNode node = new TreeNode(50);

		node.left = new TreeNode(17);
		node.right = new TreeNode(72);

		node.left.left = new TreeNode(12);
		node.left.left.left = new TreeNode(9);
		node.left.left.right = new TreeNode(14);
		node.left.right = new TreeNode(23);
		node.left.right.left = new TreeNode(19);
		//node.left.right.right = null;
		node.right.left = new TreeNode(54);
		node.right.right = new TreeNode(76);
		node.right.left.right = new TreeNode(67);
		//node.right.left.left = null;
		//node.right.right.left = null;
		//node.right.right.right = null;
		
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(node);
		q.add(node.left);
		q.add(node.right);
		q.add(node.left.left);
		q.add(node.left.left.left);
		q.add(node.left.left.right);
		q.add(node.left.right);
		q.add(node.left.right.left );
		//q.add(node.left.right.right);
		q.add(node.right.left );
		q.add(node.right.right);
		q.add(node.right.left.right);
		//q.add(node.right.left.left);
		//q.add(node.right.right.left);
		//q.add(node.right.right.right );
		
		int [] nums = new int [q.size()];
	     while (!q.isEmpty()) {
			
	    	 for (int i = 0; i < q.size(); i++) {
					
					nums[i]= q.poll().value;
					
				}
		
		ConvertSortedArrayToBalancedBST convertSortedArrayToBalancedBST= new ConvertSortedArrayToBalancedBST();
		convertSortedArrayToBalancedBST.sortedArrayToBST(nums);
		
		
	}
	     System.out.println("-----------------Nums value:--------------------");
			for (int i : nums) {
				System.out.println(i);
			}

	}
}
