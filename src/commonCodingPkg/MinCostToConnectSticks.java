package commonCodingPkg;

import java.util.PriorityQueue;

public class MinCostToConnectSticks {
	
	//time complexity -> O(nlogn)
	
	
	/**
	 * 
	 * input=[2, 4, 3]
	 * 2+3=5
	 * 5+4=9
	 * cost=5+9=14
	 * 
	 * 
	 * input=[1, 8, 3, 5]
	 * 1+3=4
	 * 4+5=9
	 * 9+8=17
	 * 
	 * 4+9+17=30
	 * 
	 * each tym re-heapify- log(n)
	 * n items log(n) 
	 * 
	 */
	public static void main(String ... args) {
		
		int[] sticks= new int[] {1, 8, 3, 5};
		
		PriorityQueue<Integer> minHeap= new PriorityQueue<>();
		
		for(int e: sticks) {
			minHeap.add(e);
		}
		int cost=0;
		while(minHeap.size()>1) {
			int sum =minHeap.remove()+minHeap.remove();
			cost+=sum;
			minHeap.add(sum);
			
		}
		System.out.print(cost);
		
		
	}
}
