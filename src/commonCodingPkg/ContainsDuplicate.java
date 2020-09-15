package commonCodingPkg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ContainsDuplicate {

	public static void main(String args[]) {
		
		int[] arr=new int[] {2, 6,7, 4, 2, 7, 3};
		System.out.println(containsDuplicate(arr));
	}

	private static boolean containsDuplicate(int[] arr) {

		/*Map<Integer, Integer> map= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		}
		for(Entry<Integer, Integer> entry: map.entrySet()){
			if(entry.getValue()>=2)
			return true;	
		}
		return false;*/
		
		HashSet<Integer> numbers = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(numbers.contains(arr[i])) return true;
			numbers.add(arr[i]);
			
		}
		return false;
		
	}
}
