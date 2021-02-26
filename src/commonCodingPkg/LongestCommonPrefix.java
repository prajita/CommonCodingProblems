package commonCodingPkg;

public class LongestCommonPrefix {

	public static void main(String args[]) {
		String[] arr = new String[] { "Prajita", "Pranjal", "Pramit" };

		findLongestCommonPrefix(arr);
	}

	private static String findLongestCommonPrefix(String[] arr) {
		String longestCommonPrefix = "";

		if (arr.length == 0 || arr == null) {
			return longestCommonPrefix;
		}
		int index = 0;

		for (char c : arr[0].toCharArray()) {
			for (int i = 1; i < arr.length; i++) {
				if (index >= arr[i].length() || c != arr[i].charAt(index)) {
					return longestCommonPrefix;
				}
			}
			longestCommonPrefix += c;
			index++;

		}
		return longestCommonPrefix;


	}
}
