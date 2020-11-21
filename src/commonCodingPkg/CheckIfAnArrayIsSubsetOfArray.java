package commonCodingPkg;

public class CheckIfAnArrayIsSubsetOfArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 2, 7, 6, 3, 4, 0, 11, 7, 1 };
		int subarr[] = new int[] { 6, 0, 7, 12 };

		System.out.println(checksubset(arr, subarr));

	}

	private static boolean checksubset(int[] arr, int[] subarr) {
		int i, j;
		for (i = 0; i < subarr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (subarr[i] == arr[j])
					break;
			}
			if (j == arr.length) {
				return false;

			}
		}
		return true;

	}
}