package testTree;

import java.util.LinkedList;
import java.util.Queue;

class NodeT {
	int data;
	NodeT left, right;

	public NodeT(int input) {
		data = input;
		left = null;
		right = null;
	}
}

//breadth first traversal
public class TestBFT {
	NodeT root;
	void printLevelTraversal() {
		Queue<NodeT> queue = new LinkedList<NodeT>();
		queue.add(root);
		while (!queue.isEmpty()) {
			NodeT temp = queue.poll();
			System.out.print(temp.data + "  ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	public static void main(String args[]) {

		TestBFT tree = new TestBFT();
		System.out.println(tree.getClass().isInstance(tree));

		tree.root = new NodeT(1);
		tree.root.left = new NodeT(2);
		tree.root.right = new NodeT(3);
		tree.root.left.left = new NodeT(4);
		tree.root.left.right = new NodeT(5);
		tree.root.right.left = new NodeT(6);
		tree.root.right.right = new NodeT(7);

		tree.root.left.right.left = new NodeT(10);
		tree.root.left.right.right = new NodeT(11);
		tree.root.right.left.left = new NodeT(12);
		tree.root.right.left.right = new NodeT(13);
		tree.root.right.right.left = new NodeT(14);
		tree.root.right.right.right = new NodeT(15);

		tree.root.left.left.left = new NodeT(8);
		tree.root.left.left.right = new NodeT(9);
		System.out.println("Level order traversal of binary tree is - ");
		tree.printLevelTraversal();
	}

	public void checkIfBST() {

	}

}
