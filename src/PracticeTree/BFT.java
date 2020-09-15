package PracticeTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int val;
	Node left,right;

	public Node(int v) {
		val = v;
		left = null;
		right = null;
	}
}

public class BFT {

	Node root;

	void breadthFirstTraversal() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.val + " ");

			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
		}

	}

	public static void main(String args[]) {
		BFT tree = new BFT();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		tree.root.right.right.left = new Node(14);
		tree.root.right.right.right = new Node(15);
		System.out.println("Level order traversal of binary tree is - ");
		tree.breadthFirstTraversal();

	}
}
