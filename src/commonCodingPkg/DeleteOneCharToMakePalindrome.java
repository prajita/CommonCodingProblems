package commonCodingPkg;

public class DeleteOneCharToMakePalindrome {

	public static void main(String[] args) {
		String str = "aba";

		System.out.println(makePalindrome(str));
	}

	private static boolean makePalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while (left <= right) {
			if (str.charAt(left) == str.charAt(right)) {
				left=left+1;
				right=right-1;
			}else {
				if (checkPalindrome(str, left + 1, right) == true) {
					return true;
				}
				if (checkPalindrome(str, left, right - 1) == true) {
					return true;
				}
				return false;
			}
		}
		return true;
	}

	private static boolean checkPalindrome(String str, int left, int right) {
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}
		return true;
	}
}
