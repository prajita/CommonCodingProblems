package testTree;

public class PrintMirrorTree {

	public static void main(String args[]) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		printPreOrder(root);
		printMirrorTree(root);
		System.out.println("mirror:\n");
		printPreOrder(root);

	}

	private static Node printMirrorTree(Node root) {

		if (root == null) {
			return null;
		}		

		Node left = printMirrorTree(root.left);
		Node right = printMirrorTree(root.right);

		root.left = right;
		root.right = left;

		return root;

	}

	private static void printPreOrder(Node root) {
		if (root == null)
			return;
		System.out.println(root.data);
		if (root.left != null) {
			printPreOrder(root.left);
		}
		if (root.right != null) {
			printPreOrder(root.right);
		}

	}

}
