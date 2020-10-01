package testTree;

import java.util.Stack;

public class PostOrderTraversalSingleStack {
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		printPostOrder(root);
	}

	private static void printPostOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (root != null) {
				stack.push(root);
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty())
				return;
			root = stack.pop();
			if (!stack.empty() && stack.peek() == root)
				root = root.right;
			else {
				System.out.print(root.data + " ");
				root = null;
			}
		}
	}
}
