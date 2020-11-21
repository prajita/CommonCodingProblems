package testTree;

import java.util.Stack;

public class CheckIf2TreesIdentical {
	public static void main(String args[]) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		root1.left.left.left = new Node(8);
		root1.left.left.right = new Node(9);
		root1.right.right.left = new Node(10);
		root1.right.right.right = new Node(11);

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		System.out.println(checkIdentical(root, root1));
	}

	private static boolean checkIdentical(Node root, Node root1) {

		if (root == null && root1 == null)
			return true;
		else if (root != null && root1 != null) {
			return (root.data == root1.data && checkIdentical(root.left, root1.left)
					&& checkIdentical(root.right, root1.right));
		} else {
			return false;
		}

	}
}
