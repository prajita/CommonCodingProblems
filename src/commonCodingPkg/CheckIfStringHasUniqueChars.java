package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;

public class CheckIfStringHasUniqueChars {
	public static void main(String args[]) {
		String a = "RJTASINHKLZZ";
		String b = "PRAJITASINHA";
		
//		System.out.println(checkIfUniqueCharsHashMap(a));
		System.out.println(checkIfUniqueChars(a.toUpperCase()));
	}
	private static boolean checkIfUniqueChars(String a) {
		int[] chararr=new int[26];
		for(int i=0;i<a.length();i++) {
			
			int val=a.charAt(i);
			if(chararr[val-65]!=0) {
				return false;
			}else {
				chararr[val-65]=1;
			}
		}
		return true;
	}
	private static boolean checkIfUniqueCharsHashMap(String str) {
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				return false;
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		return true;
	}
}
