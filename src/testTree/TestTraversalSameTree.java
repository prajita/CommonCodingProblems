package testTree;


public class TestTraversalSameTree {
	static int preIndex = 0;

	public static int find(int[] arr, int start, int end, int value) {
		for (int i = start; i <= end; i++) {
			if (arr[i] == value)
				return i;

		}
		return -1;
	}

	public static Node buildTree(int[] in, int[] pre, int start, int end) {
		Node root = new Node(pre[preIndex++]);
		if (start == end)
			return root;
		int indexInOrder = find(in, start, end, root.data);
		root.left = buildTree(in, pre, start, indexInOrder - 1);
		root.right = buildTree(in, pre, indexInOrder + 1, end);
		return root;

	}

	public static int checkPostorder(Node node, int postOrder[], int index) {
		if (node == null)
			return index;

		index = checkPostorder(node.left, postOrder, index);
		index = checkPostorder(node.right, postOrder, index);
		if (node.data == postOrder[index])
			index++;
		else
			return -1;

		return index;
	}

	public static void main(String args[]) {
		int[] inOrder = { 4, 2, 5, 1, 3 };
		int[] preOrder = { 1, 2, 4, 5, 3 };
		int[] postOrder = { 4, 5, 2, 3, 1 };
		Node root = buildTree(inOrder, preOrder, 0, inOrder.length - 1);
		int index = checkPostorder(root, postOrder, 0);

		if (index == inOrder.length)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
