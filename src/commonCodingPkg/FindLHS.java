package commonCodingPkg;

import java.util.Map;
import java.util.TreeMap;

/*
 * 
 * 
 * We define a harmonious array as an array 
 * where the difference between its maximum 
 * value and its minimum value is exactly 1.

Given an integer array nums, 
return the length of its longest harmonious 
subsequence among all its possible subsequences.

A subsequence of array is a sequence 
that can be derived from the array by
 deleting some or no elements without
  changing the order of the remaining elements.
 */
public class FindLHS {
	public static void main(String[] args) {

		System.out.println(find(new int[] { 1, 1, 2, 3, 3, 4, 13, -14 }));
	}

	public static int find(int[] nums) {
		int res = 0;
		int nearest_next = 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Integer k : map.keySet()) {
			int currval = map.get(k);

			if (map.containsKey(k + 1)) {
				nearest_next = map.get(k + 1);

			} else {
				continue;
			}
			res = Math.max(nearest_next + currval, res);
		}
		return res;
	}
}
