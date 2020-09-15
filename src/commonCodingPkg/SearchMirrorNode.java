package commonCodingPkg;

class Node {
	int key;
	Node left, right;

	public Node(int k) {
		this.key = k;
		this.left = null;
		this.right = null;
	}
}

public class SearchMirrorNode {
	public static int findMirrorRec(int target,Node left,Node right){
		if(left==null||right==null){
			return -1;
		}
		if(left.key==target){
			return right.key;
		}
		if(right.key==target){
			return left.key;
		}
		int temp=findMirrorRec(target,left.left, right.right);
		if(temp!=-1){
			return temp;
		}
		return findMirrorRec(target,left.right, right.left);
	}
	public static int findMirror(Node root, int target) {
		if(root==null){
			return -1;
		}
		if(root.key==target){
			return root.key;
		}else{
			return findMirrorRec(target,root.left,root.right);
		}
	}

	public static void main(String args[]) {
		Node root = new Node(4);
		root.left = new Node(5);
		root.right = new Node(3);
		root.left.left = new Node(7);
		root.left.right = new Node(8);
		root.right.left = new Node(5);
		root.right.right = new Node(9);
		root.left.left.left = new Node(22);
		root.right.right.right = new Node(11);

		int target = root.left.left.left.key;
		int mirror = findMirror(root, target);

		if (mirror != -1)
			System.out.println("Mirror of Node " + target + " is Node "
					+ mirror);
		else
			System.out.println("Mirror of Node " + target + " is null ");

	}
}
