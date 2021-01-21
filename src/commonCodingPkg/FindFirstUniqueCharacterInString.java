package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueCharacterInString {
	public static void main(String args[]) {
		String str = "ABHGGGFFDRDRTTASBHH";
		System.out.println(findFirstUnique(str));
	}

	private static int findFirstUnique(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, i);
			} else {
				map.put(c,-1);
			}
		}
		int min=Integer.MAX_VALUE;
		for(char c: map.keySet()) {
		    if(map.get(c)>-1  && map.get(c)<min) {
		    	min=map.get(c);
		    }
		}
		return min==Integer.MAX_VALUE ? -1 : min;
	}
}
