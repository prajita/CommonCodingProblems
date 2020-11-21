package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;

public class FindCharactersWithFreq5InArray {
	public static void main(String[] args) {

		char[] arr = new char[] { 'A', 'A', 'A', 'B', 'A', 'K', 'K', 'K', 'A', 'K', 'K', 'B' };
		findCount(arr);
	}

	private static void findCount(char[] arr) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.keySet().contains(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==5) {
				System.out.print(entry.getKey()+"    ");
			}
		}
	}
}
