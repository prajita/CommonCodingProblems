package commonCodingPkg;

import java.util.Scanner;

public class FindFirstRecurringCharacter {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String in = sc.next();

		System.out.println(callUtil(in));
		
	}

	private static char callUtil(String in) {
		int[] arr = new int[26];
		char res = (char) 0;
		int i = 0;
		while (i < in.length()) {

			if (arr[in.charAt(i) - 65] == 0) {
				arr[in.charAt(i) - 65] = 1;
			} else {
				res = in.charAt(i);
				break;
			}
			i++;

		}
		return res;
	}
}
