package PracticeTree;

class Values {
	int min = 0;
	int max = 0;
}

public class VerticalTraversalRecursive {
	Node root;
	Values val = new Values();

	public void findMinMax(Node n, Values val,int hd) {
		if (n == null)
			return;
		if (hd < val.min) {
			val.min = hd;
		} else if (hd > val.max) {
			val.max = hd;
		}
		findMinMax(n.left, val,hd - 1);
		findMinMax(n.left,val, hd + 1);
	}

	public void printVertical(Node n,int line, int hd) {
		if (n == null) {
            return;
		}
		if(hd==line)System.out.print(n.val+"   ");
		printVertical(n.left,line,hd-1);
		printVertical(n.right,line,hd+1);
	}

	public void traverseVertical(Node n) {
		findMinMax(n,val,0);
		for (int i = val.min; i <= val.max; i++) {
			printVertical(n, i,0);
			System.out.println("");
		}

	}

	public static void main(String args[]) {

		VerticalTraversalRecursive tree = new VerticalTraversalRecursive();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.right.left.left = new Node(12);
		tree.root.right.left.right = new Node(13);
		tree.root.right.right.left = new Node(14);
		tree.root.right.right.right = new Node(15);
		System.out.println("Level order traversal of binary tree is - ");
		tree.traverseVertical(tree.root);

	}

}
