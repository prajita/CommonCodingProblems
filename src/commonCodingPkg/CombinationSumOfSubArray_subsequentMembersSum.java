package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumOfSubArray_subsequentMembersSum {
	public static void main(String args[]) {
		int[] candidates = new int[] { 5, 7, 8, 2, 3, 1, 6, 11 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		findArr(candidates, 13, 0, 0, list);
		list.stream().forEach(e->System.out.println(e));
	}

	public static void findArr(int[] arr, int target, int start, int end, List<List<Integer>> res) {

		if (end == arr.length) {
			return;
		}
		if (start > end) {
			findArr(arr, target, 0, end + 1, res);
		} else {
			int sum = 0;
			for (int i = start; i < end; i++) {
				sum += arr[i];
				System.out.print(arr[i]+"  ");
			}
			System.out.println();
			if (sum == target) {
				List<Integer> l = new ArrayList<Integer>();
				for (int i = start; i < end; i++) {					
					l.add(arr[i]);
				}
				res.add(l);
			}
			findArr(arr, target, start+1, end, res);
			
		}

	}

}
