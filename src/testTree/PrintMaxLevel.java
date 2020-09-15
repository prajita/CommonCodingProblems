package testTree;

class NodeTree1 {
	int data;
	NodeTree1 left, right;

	NodeTree1(int item) {
		data = item;
		left = right = null;
	}
}

public class PrintMaxLevel {

	NodeTree1 root;

	public int print(NodeTree1 root) {
		if (root == null) {
			return 0;
		}
		int lh=print(root.left);
		int rh=print(root.right);
		int h= Math.max(lh,rh)+1;
		return h;

	}

	public static void main(String args[]) {
		PrintMaxLevel tree = new PrintMaxLevel();

		tree.root = new NodeTree1(1);
		tree.root.left = new NodeTree1(2);
		tree.root.right = new NodeTree1(3);
		tree.root.left.left = new NodeTree1(4);
		tree.root.left.right = new NodeTree1(5);
		tree.root.right.left = new NodeTree1(6);
		tree.root.right.right = new NodeTree1(7);
		tree.root.right.left.right = new NodeTree1(8);
		tree.root.right.right.right = new NodeTree1(9);

		System.out.println("max level is :");
		System.out.println(tree.print(tree.root));
	}
}
