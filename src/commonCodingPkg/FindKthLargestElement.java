package commonCodingPkg;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindKthLargestElement {
	
	//1st approach
	public static int findKthLargest(int[] arr, int k) {
		//Arrays.asList() returns List<int[]> not List<Integer>, so use stream of JAVA 8
		
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		list = list.stream().sorted((a, b)-> b-a).skip(k-1).limit(1).collect(Collectors.toList());
		
		
		return list.get(0);
	}
	public static void main(String ... args) {
		
		int[] input = new int [] {11, 3, 2, 1, 15, 5, 4,45, 88, 96, 50, 45};
		int k=3;
		
		System.out.println("1st approach::"+findKthLargest(input, k));
		System.out.println("2nd approach  ::"+findKthLargestElement(input, k));
	}
	private static int findKthLargestElement(int[] input, int k) {
		
		if(input.length==0)return -1;		
		
		PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>(k, (a,b)->
		{
			if(a==b)return b-a;
			return a-b;
		});
		
		for(int i=0;i<k;i++) {
			minHeap.add(input[i]);
		}

		for(int i=k;i<input.length;i++) {
			if(minHeap.peek()<input[i]) {
				minHeap.poll();
				minHeap.add(input[i]);
			}
		}
		
	    Iterator iterator = minHeap.iterator(); 
		while (iterator.hasNext()) 
	    { 
	        System.out.print(iterator.next() + " "); 
	    }
		
		return minHeap.remove();
	}
}
