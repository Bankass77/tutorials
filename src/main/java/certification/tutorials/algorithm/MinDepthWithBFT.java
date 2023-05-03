package certification.tutorials.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthWithBFT {

	public int minDepth(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		int depth = 1;

		TreeNode treeNode = root;
		while (!queue.isEmpty()) {

			TreeNode tNode = queue.poll();

			if (tNode.left == null && tNode.right == null) {

				break;
			}

			if (tNode.left != null) {

				queue.add(tNode.left);
			}

			if (tNode.right != null) {

				queue.add(tNode.right);
			}

			if (tNode == treeNode) {
				depth++;

				treeNode = (tNode.right != null) ? tNode.right : tNode.left;
			}
		}
		return depth;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.left.right= null;
		root.left.left=null;
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		MinDepthWithBFT minDepthWithBFT = new MinDepthWithBFT();

		System.out.println(minDepthWithBFT.minDepth(root));

	}

}
