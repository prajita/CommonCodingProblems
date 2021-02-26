package testTree;

import java.util.ArrayList;
import java.util.List;

public class PrintRightSideView {

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		//root.left.left.right = new Node(9);

		printRightView(root);
	}

	private static void printRightView(Node root) {

		int level = 0;
		int max_level = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		callUtil(root, level, max_level, list);

		for (Integer e : list) {
			System.out.println(e + "  ");
		}

	}

	private static void callUtil(Node root, int level, int max_level, List<Integer> res) {

		if (root == null)
			return;

		if (res.size()== level) {
			max_level = level;
			res.add(root.data);
		}
		callUtil(root.right, level + 1, max_level, res);
		callUtil(root.left, level + 1, max_level, res);

	}
}
