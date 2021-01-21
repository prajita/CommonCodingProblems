package testTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMirrorNode {
	
	public static int findMirror(Node root,int val) {
		 
	    if (root == null)  
	        return 0;  
	    if (root.data == val)  
	        return val;  
	    return findMirrorRec(val, root.left, root.right);  
		
	}
	
	static int findMirrorRec(int target, Node left, Node right)  
	{  
	    /* if any of the Node is none then Node itself  
	    and decendent have no mirror, so return  
	    none, no need to further explore! */
	    if (left==null || right==null)  
	        return 0;  
	  
	    /* if left Node is target Node, then return  
	    right's key (that is mirror) and vice  
	    versa */
	    if (left.data == target)  
	        return right.data;  
	  
	    if (right.data == target)  
	        return left.data;  
	  
	    // first recur external Nodes  
	    int mirror_val = findMirrorRec(target, left.left, right.right);  
	    if (mirror_val != 0)  
	        return mirror_val;  
	  
	    // if no mirror found, recur internal Nodes  
	    return findMirrorRec(target, left.right, right.left);  
	}  
	  
	
	
	
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		root.left.left.left=new Node(8);
		root.left.left.right=new Node(9);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(11);
		System.out.println(findMirror(root,4));
		
	}
}
