package certification.tutorials.algorithm;

public class BTInversed {

	private TreeNode inverted(TreeNode root) {

		if (root == null) {

			return null;
		}
		TreeNode tmp = root.left;
		root.left = inverted(root.right);
		root.right = inverted(tmp);

		return root;
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
	
	public static void main(String[] args) {
		// création de l'arbre binaire
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        // affichage de l'arbre avant inversion
        System.out.println("-----------Avant inversion:---------------");
        printTree(root);
        System.out.println();
        BTInversed btInversed= new BTInversed();
     // inversion de l'arbre
        btInversed.inverted(root);// affichage de l'arbre après inversion
        System.out.println("---------------Après inversion:------------");
        printTree(root);
	}
}
