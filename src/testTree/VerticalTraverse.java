package testTree;



//Java program to print binary tree in reverse order 

//A binary tree node 
class NodeTree
{ 
	int data; 
	NodeTree left, right; 

	NodeTree(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class Values 
{ 
	int max, min; 
} 

class VerticalTraverse 
{ 
	NodeTree root; 
	Values val = new Values(); 

	// A utility function to find min and max distances with respect 
	// to root. 
	void findMinMax(NodeTree node, Values val, int hd) 
	{ 
		// Base case 
		if (node == null) 
			return; 

		// Update min and max 
		if (hd < val.min) 
			val.min = hd; 
		else if (hd > val.max) 
			val.max = hd; 

		// Recur for left and right subtrees 
		findMinMax(node.left, val, hd - 1); 
		findMinMax(node.right, val, hd + 1); 
	} 

	// A utility function to print all nodes on a given line_no. 
	// hd is horizontal distance of current node with respect to root. 
	void printVerticalLine(NodeTree node, int line_no, int hd) 
	{ 
		// Base case 
		if (node == null) 
			return; 

		// If this node is on the given line number 
		if (hd == line_no) 
			System.out.print(node.data + " ");		 

		// Recur for left and right subtrees 
		printVerticalLine(node.left, line_no, hd - 1); 
		printVerticalLine(node.right, line_no, hd + 1); 
	} 

	// The main function that prints a given binary tree in 
	// vertical order 
	void verticalOrder(NodeTree node) 
	{ 
		// Find min and max distances with resepect to root 
		findMinMax(node, val,  0); 

		// Iterate through all possible vertical lines starting 
		// from the leftmost line and print nodes line by line 
		for (int line_no = val.min; line_no <= val.max; line_no++) 
		{ 
			printVerticalLine(node, line_no, 0); 
			System.out.println(""); 
		} 
	} 

	// Driver program to test the above functions 
	public static void main(String args[]) 
	{ 
		VerticalTraverse tree = new VerticalTraverse(); 

		/* Let us construct the tree shown in above diagram */
		tree.root = new NodeTree(1); 
		tree.root.left = new NodeTree(2); 
		tree.root.right = new NodeTree(3); 
		tree.root.left.left = new NodeTree(4); 
		tree.root.left.right = new NodeTree(5); 
		tree.root.right.left = new NodeTree(6); 
		tree.root.right.right = new NodeTree(7); 
		tree.root.right.left.right = new NodeTree(8); 
		tree.root.right.right.right = new NodeTree(9); 

		System.out.println("vertical order traversal is :"); 
		tree.verticalOrder(tree.root); 
	} 
} 

//This code has been contributed by Mayank Jaiswal 
