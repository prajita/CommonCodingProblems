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
	
	public static void findMirror(Node node,int val) {
		Queue<Node> q =new LinkedList<Node>();
		int countofNodesAtlevel=0,numberOfNodes=1;
		Boolean ifNextLevelHasMirror=false;
		q.add(node);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp!=null) {
				q.add(temp.left);
				q.add(temp.right);
			}else {
				q.add(null);
				q.add(null);
			}
			
			if(temp.left.data==val||temp.right.data==val) {
				ifNextLevelHasMirror=true;
			}
			countofNodesAtlevel++;
			if(numberOfNodes==countofNodesAtlevel) {
				if(ifNextLevelHasMirror) {
					break;
				}
			
				numberOfNodes=2*numberOfNodes;
				countofNodesAtlevel=0;
			}
			
		}
		int index=1;
		
		
		
//		Stream<Node> st= q.stream();
//		List<Node> li=st.collect(Collectors.toList());
//		ArrayList<Node> arr= new ArrayList<Node>(li);
		
		
		ArrayList<Node> arr= new ArrayList<Node>();
		while(!q.isEmpty()) {
			arr.add(q.poll());
		}
		
		
		for(int i=0;i<q.size();i++) {
			if(arr.get(i).data==val) {
				index=i;
				break;
			}
		}
		System.out.println(arr.get(arr.size()-index).data);
		
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
		findMirror(root,8);
		
	}
}
