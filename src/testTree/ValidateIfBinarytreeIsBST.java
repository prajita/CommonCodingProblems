package testTree;

public class ValidateIfBinarytreeIsBST {
	public static void main(String args[]) {
		Node root = new Node(26);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(4);
		root.left.right = new Node(25);

		System.out.println(checkIfBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private static boolean checkIfBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.data > max || root.data < min)
			return false;

		return checkIfBST(root.left, min, root.data - 1) && checkIfBST(root.right, root.data + 1, max);

	}
}
