package commonCodingPkg;

import java.util.Arrays;
import java.util.List;

public class MaxlengthOfConcatenatedStringUniqueChar {

	public static void main(String[] args) {
		String[] arr = new String[] { "un", "iq", "qe" };
		getMaxlength(arr);
	}

	private static void getMaxlength(String[] arr) {
		int[] res = new int[1];
		List<String> list = Arrays.asList(arr);
		list.stream().forEach(e -> System.out.print(e + "  "));
		callRec(list, 0, "", res);
		System.out.println(res[0]);
	}

	private static void callRec(List<String> arr, int index, String curr, int[] res) {

		if (index == arr.size() && countUniqueChar(curr) > res[0]) {
			res[0] = curr.length();
			return;

		}
		if (index == arr.size())
			return;

		callRec(arr, index + 1, curr, res);
		callRec(arr, index + 1, curr + arr.get(index), res);

	}

	private static int countUniqueChar(String str) {
		int[] arr = new int[26];
		for (char c : str.toCharArray()) {
			if (arr[c - 'a']++ > 0) {
				return -1;
			}
		}
		return str.length();
	}
}
