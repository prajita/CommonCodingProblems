package testTree;

public class FindClosestToK_BST {
    static int min_diff, closest; 

	public static void main(String[] args) {

		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(7);
		root.right = new Node(15);
		root.right.left = new Node(11);
		root.right.right = new Node(16);
		root.left.left.left = new Node(2);
		root.left.left.right = new Node(5);

		int res = minDiff(root, 11);
		System.out.println(res);

	}

	private static int minDiff(Node root, int k) {
		min_diff = Integer.MAX_VALUE; closest = -1;
		findClosest(root, k);
		return closest;
	}

	private static void findClosest(Node root, int i) {
		if (root == null)
			return;
		if (root.data == i) {
			closest = root.data;
			return;
		}
		if (min_diff > Math.abs(root.data - i)) {

			min_diff = Math.abs(root.data - i);
			closest = root.data;
		}
		if (i < root.data) {

			findClosest(root.left, i);

		} else {

			findClosest(root.right, i);
		}

	}
}
