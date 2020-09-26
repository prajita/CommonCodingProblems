package commonCodingPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCharWithFreqK {

	public static List<Integer> findCharWithFreqK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= k) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		List<Integer> result = findCharWithFreqK(nums, k);
		result.stream().forEach(System.out::println);
	}
}
