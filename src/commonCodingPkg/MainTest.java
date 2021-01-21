package commonCodingPkg;

public class MainTest {

	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static long recur(int[] digits, int i, String str, long res) {
		if (i == digits.length) {
			System.out.println(str);
			res++;
			return res;
		}

		int sum = 0;
		for (int j = i; j <= Integer.min(i + 1, digits.length - 1); j++) {
			sum = (sum * 10) + digits[j];

			if (sum > 0 && sum <= 26) {
				 res=recur(digits, j + 1, str + alphabet.charAt(sum - 1), res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] digits = { 2, 1, 0 };

		String str = "";
		long res=0;
		System.out.println(recur(digits, 0, str, res));
	}
}
