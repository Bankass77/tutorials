package certification.tutorials.algorithm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.stream.Collectors;

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

	// fonction pour afficher l'arbre binaire
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.value + " ");
        printTree(root.left);
        printTree(root.right);
    }
	public static void main(String[] args) throws IOException {

		// création de l'arbre binaire
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(4);
        root.right.left = new TreeNode(13);
        root.left.left = new TreeNode(11);
        root.right.right.right = new TreeNode(1);
        root.left.left.right = new TreeNode(2);
        root.left.left.left = new TreeNode(7);
        int targetSum= 22;
        BTPathSum btPathSum= new BTPathSum();
        btPathSum.hasPathSum(root, targetSum);
        printTree(root);
	}

}
