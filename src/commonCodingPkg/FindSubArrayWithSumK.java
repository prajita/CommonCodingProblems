package commonCodingPkg;

public class FindSubArrayWithSumK {
	public static void main(String args[]) {
		int[] arr = new int[] { 4, 7, 1, 9, 2, 7, 11, 16 };
		int k = 18;

		findSubArray(arr, k, 0, 0);

	}

	private static void findSubArray(int[] arr, int k, int start, int end) {
		int res = 0;
		if (end == arr.length)
			return;
		else if (start > end) {
			findSubArray(arr, k, 0, end + 1);
		} else {
			res = 0;
			for (int i = start; i <= end; i++) {
				res += arr[i];
				// System.out.print(arr[i] + " ");

			}
			if (res == k) {
				System.out.println("\nres:" + k + " ");

				for (int i = start; i <= end; i++) {
					System.out.print(arr[i] + " ");

				}
			}
			// System.out.println();
			findSubArray(arr, k, start + 1, end);
		}
	}
}
