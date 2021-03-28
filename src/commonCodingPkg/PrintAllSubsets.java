package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
	static int count=0;
	public static void main(String... args) {

		List<List<Integer>> res = new ArrayList<>();
		List<Integer> curr= new ArrayList<>();
		
		int [] arr= new int[] {3, 6, 1, 0, 1, 2};
		callUtil(arr, 0, curr, res);
		
		for(List<Integer> e: res) {
			System.out.println(e);
		}
		System.out.println(count);
	}

	private static void callUtil(int[] arr, int index, List<Integer> curr, List<List<Integer>> res) {

		
		res.add(new ArrayList<>(curr));
		count++;
		for(int i=index;i<arr.length;i++) {
			
			curr.add(arr[i]);
			callUtil(arr, i+1, curr, res);
			curr.remove(curr.size()-1);
			
			
		}
	}
}
