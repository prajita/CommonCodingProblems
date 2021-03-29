package testTree;

public class LowestCommonAncestor {
	

	public static void main(String[] args) {
	

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.right.left.left = new Node(7);
		root.right.right.right = new Node(8);

		System.out.println(findLCA(root, root.right.left.left, root.right.right).data);
//		System.out.println(findLCA(root, root.right.left.left, new Node(10)).data);
//		System.out.println(findLCA(root, root.right.left.left, root.right.left.left).data);
//		System.out.println(findLCA(root, root.right.left.left, root.right.left).data);
//		System.out.println(findLCA(root, root.left, root.right.left).data);
	}

	private static Node findLCA(Node root, Node p, Node q) {
		
		
		if(root==null)return root;
		if(root.data==p.data || root.data==q.data) {
			return root;
		}
		
		
		Node left=findLCA( root.left, p,  q) ;
		Node right =findLCA( root.right,  p,  q) ;
		
		if(left!=null && right!=null)return root;
		
		return left!=null? left:right;
		
	}

}
