package commonCodingPkg;

import java.util.Scanner;

public class FindMaxEvenLenWord {
	public static void findMaxEven(String in) {
		int currLen = 0, maxLen = 0, startIndex = -1, i = 0;
		while (i < in.length()) {
			if (in.charAt(i) == ' ') {

				if (currLen % 2 == 0) {
					if (maxLen < currLen) {
						maxLen = currLen;
						startIndex = i - currLen;
					}

				}
				currLen = 0;

			} else {
				currLen++;
			}
			i++;
		}
		if (currLen % 2 == 0) {
			if (maxLen < currLen) {
				maxLen = currLen;
				startIndex = i - currLen;
			}
		}
		if (startIndex == -1)
			System.out.println("-1");

		System.out.println(in.substring(startIndex, startIndex + maxLen));

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		findMaxEven(s);

	}
}
