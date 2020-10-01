package testTree;

import java.util.Stack;

public class PostOrderTraversalWith2Stacks {
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
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();

		stack1.push(root);
		while (!stack1.isEmpty()) {

			Node temp = stack1.pop();
			stack2.push(temp);
			if (temp.left != null)
				stack1.push(temp.left);

			if (temp.right != null)
				stack1.push(temp.right);
		}
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop().data+"    ");
		}

	}
}
