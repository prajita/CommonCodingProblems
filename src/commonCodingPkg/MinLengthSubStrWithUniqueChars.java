package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;

public class MinLengthSubStrWithUniqueChars {
	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out.println("final count:: " + minLengthSubstr(str));
	}

	private static int minLengthSubstr(String str) {
		int n = str.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            
            if (!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(str.charAt(i++));
            }
        }
        return ans;
	}

}
