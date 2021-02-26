package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class StringReorganize {
	public static void main(String[] args) {
		String str = "AVYYYYSHKLIUUUTY";
		System.out.println(str.substring( 1));

		System.out.println(str.substring(0, 1).concat(str.substring(2)));
		System.out.println(callutil(str));
	}

	private static String callutil(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

//		Set<Character> set = new TreeSet<Character>();
//		for (char c : str.toCharArray()) {
//			set.add(c);
//		}
//		System.out.println("set::"+set);
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		maxHeap.addAll(map.keySet());
		//System.out.println(maxHeap);
		StringBuilder sb = new StringBuilder();
		while (maxHeap.size() > 1) {
			char current = maxHeap.remove();
			char next = maxHeap.remove();
			
			sb.append(current);
			sb.append(next);

			map.put(current, map.get(current) - 1);
			map.put(next, map.get(next) - 1);

			if (map.get(current) > 0) {
				maxHeap.add(current);
			}
			if (map.get(next) > 0) {
				maxHeap.add(next);
			}

		}

		if (!maxHeap.isEmpty()) {
			char last = maxHeap.remove();
			if (map.get(last) > 1) {
				return "";
			}
			sb.append(last);
		}
		return sb.toString();
	}
}
