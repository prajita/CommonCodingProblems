package testTree;

public class RemoveNodesNotInPathWithSumK {
	public static void main(String args[]) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(0);
		root.right.right = new Node(1);
		int sum = 6;
		printTreePreOrder(root);
		System.out.println();
		prune(root, sum);
		System.out.println();
		printTreePreOrder(root);

	}

	private static void printTreePreOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data+"\t");
		if (root.left != null)
			printTreePreOrder(root.left);
		if (root.right != null)
			printTreePreOrder(root.right);

	}

	private static Node prune(Node root, int sum) {

		if (root == null) {
			return null;
		}
		root.left = prune(root.left, sum - root.data);
		root.right = prune(root.right, sum - root.data);

		if (root.left == null && root.right == null) {
			if (root.data < sum) {
				root = null;
			}
		}
		return root;
	}

}
