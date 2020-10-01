package testTree;

import java.util.HashSet;

public class FindPairsOfSumBST {

	public static Node insertNode(Node root, int key) {
		if (root == null)
			return new Node(key);
		if (root.data <= key)
			root.right = insertNode(root.right, key);
		else
			root.left = insertNode(root.left, key);
		return root;

	}

	public static boolean findPairUtil(Node node, int sum, HashSet<Integer> set) {
		System.out.println("set is::");
		set.stream().forEach(System.out::println);
		if (node == null)
			return false;
		if (findPairUtil(node.left, sum, set))
			return true;

		if (set.contains(sum - node.data)) {
			System.out.println("pair is found::" + node.data + " and " + (sum - node.data));
			return true;
		} else {
			set.add(node.data);
		}
		return findPairUtil(node.right, sum, set);
	}

	public static void findPair(Node node, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findPairUtil(node, sum, set)) {
			System.out.println("pair does not exist");
		}
	}

	public static void main(String args[]) {

		Node root = null;
		root = insertNode(root, 11);
		root = insertNode(root, 4);
		root = insertNode(root, 21);
		root = insertNode(root, 6);
		root = insertNode(root, 9);
		root = insertNode(root, 81);
		root = insertNode(root, 135);
		root = insertNode(root, 15);

		int target = 25;
		findPair(root, target);

		/*
		 * 
		 * public boolean findTarget(TreeNode root, int k) { HashSet<Integer> set = new
		 * HashSet<Integer>();
		 * 
		 * if(root==null)return false; if(findTarget(root.left, k))return true;
		 * 
		 * if(set.contains(k-root.val))return true; set.add(root.val);
		 * if(findTarget(root.right, k))return true; return false; }
		 */

	}
}
