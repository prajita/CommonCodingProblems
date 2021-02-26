package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedAnagrams {

	public static void main(String args[]) {

		String[] input = new String[] { "tea", "eat", "ate", "tan", "ant", "and" };
		List<List<String>> out = new ArrayList<List<String>>();
		System.out.println(createGroups(input, out));
	}

	private static List<List<String>> createGroups(String[] input, List<List<String>> out) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : input) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(str);
		}
		out.addAll(map.values());

		return out;
	}
}
