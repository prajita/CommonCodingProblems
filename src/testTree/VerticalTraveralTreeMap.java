package testTree;

import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalTraveralTreeMap {
	public static void  getVertical(Node n, int hd,TreeMap<Integer,Vector<Integer>> map) {
		if(n==null)return;
		Vector<Integer> v= map.get(hd);
		if(v==null) {
			v=new Vector<Integer>();
			v.add(n.data);
		}else {
			v.add(n.data);
		}
		map.put(hd,v);
		getVertical(n.left,hd-1,map);
		getVertical(n.right,hd+1,map);
	}
	public static void printVertical(Node n) {
		
		TreeMap<Integer,Vector<Integer>> map=new TreeMap<>();
		getVertical(n,0,map);
		for(Map.Entry<Integer,Vector<Integer>> e: map.entrySet()) {
			System.out.println(e.getKey()+"::"+e.getValue());
		}
	}
	
	public static void main(String[] args) {
		Node n= new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		n.left.left.left=new Node(8);
		n.left.left.right=new Node(9);
		n.left.right.left=new Node(10);
		n.left.right.right=new Node(11);
		
		
		printVertical(n);
		
	}
}
