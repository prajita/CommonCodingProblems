package commonCodingPkg;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountCharactersFreq {

	public static void sortChars(HashMap<Character, Integer> map, int length) {

		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());

		Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (Map.Entry<Character, Integer> entry : list) {
			hashmap.put(entry.getKey(), entry.getValue());
			System.out.println("entry counts::" + entry.getKey() + " " + entry.getValue());
		}
		
		list.stream().forEach(System.out::println);
		char[] result = new char[length];
		int count=0;
		
		
		for (Map.Entry<Character, Integer> entry : list) {
			for(int i=0;i<entry.getValue();i++) {
				System.out.print(entry.getKey());
				result[count++]=entry.getKey();
			}
			
		}
		System.out.println("");
		System.out.print("print result concatenated character array::"+new String(result));

	}

	public static void main(String[] args) {

		String input = "hellolloppohfr";

		char[] charset = input.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < charset.length; i++) {
			char temp = charset[i];
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		sortChars(map, charset.length);

	}

}
