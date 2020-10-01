package testTree;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathsToLeafBinaryTree {
	public static void main(String args[]) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);

		binaryTreePath(root).stream().forEach(System.out::println);
	}

	private static List<String> binaryTreePath(Node root) {
		List<String> list = new ArrayList<String>();
		if (root == null)
			return list;
		findAllPaths(root, "", list);
		return list;
	}

	private static void findAllPaths(Node root, String path, List<String> list) {
		path += root.data;
		if (root.left == null && root.right == null) {
			list.add(path);
			return;
		}
		if (root.left != null) {
			findAllPaths(root.left, path+"->", list);
		}
		if (root.right != null) {
			findAllPaths(root.right, path+"->", list);
		}
	}
}
