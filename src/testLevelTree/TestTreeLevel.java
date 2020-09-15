package testLevelTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	Node(int p) {
		data = p;
		left = null;
		right = null;
	}
}

public class TestTreeLevel {

	static void calculateLevel(Node root) {
		// Map<Node, Integer> maptree = new HashMap<Node, Integer>();
		// maptree.put(root, 1);
		// maptree.get(root);
		// System.out.println(root.data+" has a level "+maptree.get(root));
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (true) {
			int size = q.size();
			if(size == 0) 
                break; 
			while (size>0) {
				Node temp = q.peek();
				System.out.print(temp.data+" ");
				q.remove();
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}				
				size--;
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		
		Node root = new Node(23);
		root.left = new Node(45);
		root.right = new Node(4);
		root.left.left = new Node(67);
		root.left.right = new Node(6);
		root.right.left = new Node(10);
		root.right.right = new Node(8);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(16);
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(95);
		root.right.right.right = new Node(17);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		calculateLevel(root);
	}

}
