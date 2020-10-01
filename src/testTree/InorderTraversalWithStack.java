package testTree;

import java.util.Stack;

public class InorderTraversalWithStack {
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
		printInOrder(root);
	}

	private static void printInOrder(Node root) {

		Stack<Node> stack = new Stack<>();
		Node curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.print(curr.data+"   ");
			curr = curr.right;

		}
	}
}
