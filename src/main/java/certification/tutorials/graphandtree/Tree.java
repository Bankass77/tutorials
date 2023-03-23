package certification.tutorials.graphandtree;

public class Tree {

	public Node root; // first node of tree

	public Tree(Node root) { // constructor
		super();
		this.root = null; // no nodes in tree yet
	}

	public Node find(int key) { // find node with given key

		// assumes non-empty tree=suppose un arbre non vide

		Node current = root; // start at root

		while (current.value != key) {

			if (key < current.value) { // go left?

				current = current.leftChild;
			} else {
				// or go right
				current = current.rightChild;
			}

			if (current == null) { // if no child,

				return null; // didn't find it
			}
		}
		return current; // found it

	}

	// Insert Node

	public void insert(int key) {

		Node newNode = new Node();

		newNode.value = key; // insert data

		if (root == null) { // no node in root

			root = newNode;
		} else {
			// root occupied

			Node current = root; // start at root
			Node parent;

			while (true) { // exits internally
				parent = current;
				if (key < current.value) { // go to left
					current = current.leftChild;

					if (current == null) { // if end of the line,

						// insert on left

						parent.leftChild = newNode;
						return;

					} // end else go right

				} // end while

			} // end else not root
		}

	}// end insert

	// ---------------------------------------------

	public boolean delete(int key) {

		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.value != key) {// search for node

			parent = current;
		}

		return true;

	}

}
