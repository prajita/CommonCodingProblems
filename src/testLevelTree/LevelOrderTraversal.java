package testLevelTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static void printLevelOrderTraversal(Node root) {
		
	
	Queue<Node> q1= new LinkedList<Node>();
	Queue<Node> q2= new LinkedList<Node>();
	
	q1.offer(root);
	while(!q1.isEmpty() || !q2.isEmpty()) {
		
		while(!q1.isEmpty()) {
			Node temp = q1.poll();
			System.out.println(temp.data);
			if(temp.left!=null) q2.offer(temp.left);
			if(temp.right!=null) q2.offer(temp.right);
		}
		while(!q2.isEmpty()) {
			Node temp = q2.poll();
			System.out.println(temp.data);
			if(temp.left!=null) q1.offer(temp.left);
			if(temp.right!=null) q1.offer(temp.right);
				
		}
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
		printLevelOrderTraversal(root);
	}
}
