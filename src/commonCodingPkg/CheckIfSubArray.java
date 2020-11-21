package commonCodingPkg;

public class CheckIfSubArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 6, 1, 8, 3, 6, 7, 9, 11 };
		int[] subarr = new int[] { 6, 1, 8, 3 };

		System.out.println(chekcsubarr(arr, subarr));
	}

	private static boolean chekcsubarr(int[] arr, int[] subarr) {
		int i = 0, j = 0;
		;
		while (i < arr.length && j < subarr.length) {

			if (arr[i] == subarr[j]) {
				i++;
				j++;
				if (j == subarr.length)
					return true;
			} else {
				i++;
				j = 0;
			}

		}
		return false;

	}
}
