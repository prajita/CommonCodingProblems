package testTree;

import java.util.Stack;

public class PreOrderTraversalWithStack {
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

		printPreOrder(root);
	}

	private static void printPreOrder(Node root) {

		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		while (curr != null || !stack.isEmpty()) {
			while(curr!=null) {
				System.out.print(curr.data+"     ");
				if(curr.right!=null)stack.push(curr.right);
				curr=curr.left;
			}
			if(!stack.isEmpty()) {
				curr=stack.pop();
			}
		}

	}
}
