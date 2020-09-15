package printSpiralBFS;

class Node {
	int val;
	Node left, right;

	Node(int k) {
		val = k;
		this.left = null;
		this.right = null;
	}
}

public class PrintSpiralBFS {
	public static void printLevel(Node node, int level, Boolean flag) {
		if (node == null)
			return;
		if (level == 1) {
			System.out.print(node.val + " ");
		} else {
			if (!flag) {
				printLevel(node.left, level-1, flag);
				printLevel(node.right, level-1, flag);

			} else {
				printLevel(node.right, level-1, flag);
				printLevel(node.left, level-1, flag);

			}
		}

	}

	public static int height(Node node) {
		if (node == null)
			return 0;
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;

	}

	public static void printSpiral(Node node) {

		int h = height(node);
		System.out.println("print height::"+h);
		Boolean flag = false;
		for (int i = 1; i <= h; i++) {
			printLevel(node, i, flag);
			flag = !flag;
		}

	}

	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(7);
		root.left.left = new Node(9);
		root.left.right = new Node(31);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(13);
		root.left.left.left = new Node(45);
		root.left.left.right = new Node(98);
		printSpiral(root);
	}
}
