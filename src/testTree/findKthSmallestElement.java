package testTree;

import java.util.Stack;

public class findKthSmallestElement {
	public static void main(String[] args) {

		Node root = new Node(9);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.right = new Node(7);
		root.right = new Node(11);
		root.right.left = new Node(10);
		root.right.right = new Node(13);

		int k = 3;
		System.out.println(findKthSmallest(root, k));

	}

	private static int findKthSmallest(Node root, int k) {

		Stack<Node> stack = new Stack<Node>();
		int count = 0;
		Node curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {				
				stack.push(curr);
				curr = curr.left;
			}
			count++;
			curr = stack.pop();
			if (count == k) {
				return curr.data;
			}
			
			curr = curr.right;

		}
		return -1;
	}

}
