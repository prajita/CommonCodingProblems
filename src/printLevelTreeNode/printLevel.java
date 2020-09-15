package printLevelTreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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
class Pair{ 
    Node n; 
    int i; 
    Pair(Node n, int i){ 
        this.n = n; 
        this.i = i; 
    } 
      
} 

public class printLevel {
	static void calculateLevel(Node root) {

		if (root == null) 
            return; 
       
        // queue to hold tree node with level 
        Queue<Pair> q = new LinkedList<Pair>();  
       
        // let root node be at level 1 
        q.add(new Pair(root, 1));  
       
        Pair temp; 
       
        // Do level Order Traversal of tree 
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            System.out.println("Level of " + temp.n.data + " is " + temp.i); 
            if (temp.n.left != null) 
                q.add(new Pair(temp.n.left, temp.i + 1)); 
            if (temp.n.right != null) 
                q.add(new Pair(temp.n.right, temp.i + 1)); 
        }
	}

	public static void main(String args[]) {

		 Node root = null; 
	       
	        /* Constructing tree given in the  
	              above figure */
	        root = new Node(3); 
	        root.left = new Node(2); 
	        root.right = new Node(5); 
	        root.left.left = new Node(1); 
	        root.left.right = new Node(4); 
	        root.left.left.left = new Node(6); 
	        root.left.left.right = new Node(7); 
	        root.left.right.left = new Node(81); 
	        root.left.right.right = new Node(4); 
	        root.left.right.right.left = new Node(4); 
	        root.left.right.right.right = new Node(9); 
	        calculateLevel(root);
	}
}










