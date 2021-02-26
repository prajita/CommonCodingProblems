package commonCodingPkg;

public class VerifyingAlienDictionary {
	public static void main(String args[]) {
		String order = "hlabcdefgijkmlnoqpstrwzxyz";
		String[] words = new String[] { "hello", "leetcode" };
		int alphabet[] = new int[26];
		for(int i=0;i<order.length();i++) {
			alphabet[order.charAt(i)-'a']=i;
		}
		System.out.println(checkTest(words, order, alphabet));
	}

	private static boolean checkTest(String[] words, String order, int[] alphabet) {
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				int min = Math.min(words[i].length(), words[j].length());
				for (int k = 0; k < min; k++) {
					int ichar = words[i].charAt(k);
					int jchar = words[j].charAt(k);
					if (alphabet[ichar - 'a'] > alphabet[jchar - 'a']) {
						return false;
					} else if (alphabet[ichar - 'a'] < alphabet[jchar - 'a']) {
						break;
					} else if (k == min - 1 && words[i].length() < words[j].length()) {
						return false;
					}
				}

			}
		}
		return true;
	}
}
