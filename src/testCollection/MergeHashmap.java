package testCollection;

import java.util.HashMap;

public class MergeHashmap {
	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Prajita");
		map1.put(2, "Debjani");
		map1.put(3, "Anu");
		map1.put(4, "Poulomi");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Arnav");
		map2.put(2, "Alo");
		map2.forEach((key,value)->
			 map1.merge(key, value, (v1,v2)->v1.equalsIgnoreCase(v2)? v1: v1+" ,"+v2)
		);
		System.out.println("merged map::"+map1);
		System.out.println("print the 2nd map"+map2);
		
		

	}
}
