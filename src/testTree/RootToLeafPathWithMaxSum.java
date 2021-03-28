package testTree;

public class RootToLeafPathWithMaxSum {

	private static void findPath(Node root) {
		int sum = rootToLeafSum(root);
		System.out.println("Maximum sum is " + sum);
		System.out.print("Maximum sum path is: ");
		printPath(root, sum);
	}

	
	
	// Function to calculate maximum root-to-leaf sum in a binary tree
		public static int rootToLeafSum(Node root) {
			
			if(root==null)return 0;
			
			int left= rootToLeafSum(root.left);
			int right= rootToLeafSum(root.right);
			
			return Math.max(left, right)+root.data;
		}
		

		public static boolean printPath(Node root, int sum) {
			
			if( sum==0) {
				return true;
			}
			if(root==null)return false;

			
			boolean left=printPath( root.left,  sum-root.data) ;
			boolean right=printPath( root.right,  sum-root.data) ;
			
			if(left||right) {
				System.out.print(root.data + " ");
			}
			
			return left||right;
		}


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

		findPath(root);
	}

}
