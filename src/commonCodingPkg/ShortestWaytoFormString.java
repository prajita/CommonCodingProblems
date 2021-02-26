package commonCodingPkg;

import java.util.Scanner;

public class ShortestWaytoFormString {
	public static void main(String args[]) {

		System.out.println("find the count to reach to target string using sibsequences of a source string..");

		Scanner sc = new Scanner(System.in);
		String source = sc.next();
		String target = sc.next();

		System.out.println(countMinSeq(source, target));
/**
 * 
 * xyz is given string, output be xzyxz, we need substrings like xz+y+xz
 * so output will be 3
 */
	}

	private static int countMinSeq(String source, String target) {
		int count = 0;
		String remaining = target;
		while (remaining.length() > 0) {
			StringBuilder subsequence = new StringBuilder();
			int i = 0, j = 0;
			while (i < source.length() && j < remaining.length()) {
				if (source.charAt(i) == remaining.charAt(j)) {
					subsequence.append(remaining.charAt(j));
					j++;
				}
				i++;
			}
			if (subsequence.length() == 0)
				return -1;
			count++;
			remaining = remaining.substring(subsequence.length());

		}
		return count;
	}
}
