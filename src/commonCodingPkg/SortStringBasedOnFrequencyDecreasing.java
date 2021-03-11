package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortStringBasedOnFrequencyDecreasing {
	public static void main(String args[]) {
		String res = callUtil("Aaaabb");
		System.out.println(res);

	}

	public static String callUtil(String s) {

		char[] charArr = s.toCharArray();
		StringBuilder res = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : charArr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		PriorityQueue<Character> minHeap = new PriorityQueue<>((a, b) -> {
			
			if (map.get(a) == map.get(b)) {
				return b - a;
			}
			return map.get(a) - map.get(b);

		});

		minHeap.addAll(map.keySet());

		while (!minHeap.isEmpty()) {

			char c = minHeap.remove();
			for (int i = 0; i < map.get(c); i++) {
				res.append(c);
			}

		}

		return res.toString();
	}
}
