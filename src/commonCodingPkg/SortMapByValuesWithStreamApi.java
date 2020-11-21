package commonCodingPkg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValuesWithStreamApi {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Prajita");
		map.put(7, "Home");
		map.put(9, "Hello");
		map.put(12, "World");
		map.put(15, "Map");
		map.put(13, "Sinha");

		Map<Integer, String> res1 = map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
				.peek(e->System.out.println(e.getKey()+"  "+e.getValue())).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		for (Map.Entry<Integer, String> e : res1.entrySet()) {
			System.out.print(e.getKey() + "  ");
			System.out.println(e.getValue());
		}
		System.out.println();
        //prev approach sorted list will be lost,u can see peek gives correct output but end result is changed,
		//to keep sorted list we need to put into LinkedHashMap
		// alternate:
		Map<Integer, String> res2 = map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));

		for (Map.Entry<Integer, String> e : res2.entrySet()) {
			System.out.print(e.getKey() + "  ");
			System.out.println(e.getValue());
		}

	}
}
