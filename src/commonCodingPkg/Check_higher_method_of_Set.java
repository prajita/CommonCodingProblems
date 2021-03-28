package commonCodingPkg;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Check_higher_method_of_Set {

	public static void main(String... args) {
		System.out.println("hello world");
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		
		System.out.println("higher check::::"+ set.lower( 4));
		
		PriorityQueue<String> q = new PriorityQueue<String>((a, b)->a.compareTo(b));
	    q.offer("ert");
	    q.offer("wer");
	    q.offer("asd");
	    q.offer("qwe");

	    System.out.println(q);
	    
	    String[] arr= new String[] {"tre", "avc", "ert"};
	    Arrays.sort(arr, (a, b)->a.compareTo(b));
	    
		for(String e: arr) {
			System.out.println(e);
		}
	}

	
}
