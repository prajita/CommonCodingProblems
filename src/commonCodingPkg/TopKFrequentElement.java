package commonCodingPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentElement {
	public static int[] findTopKFreq(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[k];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		List<Map.Entry<Integer, Integer>> maplist = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(maplist, (a, b) -> b.getValue() - a.getValue());
		maplist = maplist.stream().limit(k).collect(Collectors.toList());
		

		for(Map.Entry<Integer,Integer> entry : maplist ) {
			if(count<=k) {
				result[count++]=entry.getKey();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] result = findTopKFreq(nums, k);
		for (int e : result)
			System.out.println(e);
	}
}
